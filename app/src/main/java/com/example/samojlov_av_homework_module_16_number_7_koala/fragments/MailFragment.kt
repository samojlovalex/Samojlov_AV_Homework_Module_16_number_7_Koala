package com.example.samojlov_av_homework_module_16_number_7_koala.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import androidx.transition.TransitionInflater
import com.example.samojlov_av_homework_module_16_number_7_koala.MainActivity
import com.example.samojlov_av_homework_module_16_number_7_koala.R
import com.example.samojlov_av_homework_module_16_number_7_koala.databinding.FragmentMailBinding
import com.example.samojlov_av_homework_module_16_number_7_koala.models.Letter
import com.google.gson.Gson
import kotlin.reflect.javaType
import kotlin.reflect.typeOf


@OptIn(ExperimentalStdlibApi::class)
class MailFragment : Fragment() {

    private lateinit var binding: FragmentMailBinding
    private lateinit var addressMailTV: TextView
    private lateinit var themesMailTV: TextView
    private lateinit var textMailTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(requireActivity().applicationContext).inflateTransition(android.R.transition.move)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentMailBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    @SuppressLint("SetTextI18n")
    private fun init() {

        addressMailTV = binding.addressMailTV
        themesMailTV = binding.themesMailTV
        textMailTV = binding.textMailTV

        val letterInput = (activity as MainActivity).getData()
        val type = typeOf<Letter>().javaType
        val thisLetter = Gson().fromJson<Letter>(letterInput, type)

        if (thisLetter != null){
            themesMailTV.text = thisLetter.subject
            textMailTV.text = thisLetter.text + getString(R.string.email_text)
        }

        val args: MailFragmentArgs by navArgs()
        val thisAddress = args.myArgs
        addressMailTV.text = thisAddress
    }
}