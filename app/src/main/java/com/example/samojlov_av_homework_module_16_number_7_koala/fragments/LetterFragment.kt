package com.example.samojlov_av_homework_module_16_number_7_koala.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.samojlov_av_homework_module_16_number_7_koala.MainActivity
import com.example.samojlov_av_homework_module_16_number_7_koala.databinding.FragmentLetterBinding
import com.example.samojlov_av_homework_module_16_number_7_koala.models.Letter
import com.example.samojlov_av_homework_module_16_number_7_koala.utils.LetterAdapter
import com.google.gson.Gson
import kotlin.reflect.javaType
import kotlin.reflect.typeOf

@OptIn(ExperimentalStdlibApi::class)
class LetterFragment : Fragment() {

    private lateinit var binding: FragmentLetterBinding
    private lateinit var listOfEmailsRV: RecyclerView

    private var adapter: LetterAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLetterBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        listOfEmailsRV = binding.listOfEmailsRV

        listOfEmailsRV.layoutManager = LinearLayoutManager(context)
        initAdapter()
    }

    private fun initAdapter() {
        adapter = LetterAdapter(Letter.listOfLetter)
        listOfEmailsRV.adapter = adapter
        adapter!!.setLetterClickListener(object : LetterAdapter.OnLetterClickListener {
            override fun onLetterClickListener(letter: Letter, position: Int, address: TextView) {
                transition(letter, address)
            }
        })
    }

    private fun transition(letter: Letter, address: TextView) {

        val type = typeOf<Letter>().javaType
        val gson = Gson().toJson(letter, type)

        (activity as MainActivity).setData(gson)

        val addressTransition = address.text.toString()
        val action =
            LetterFragmentDirections.actionLetterFragmentToMailFragment(addressTransition)
        val extras = FragmentNavigatorExtras(
            address to "addressText"
        )
        findNavController().navigate(action, extras)
    }
}