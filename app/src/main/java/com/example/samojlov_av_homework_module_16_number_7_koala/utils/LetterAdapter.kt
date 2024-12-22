package com.example.samojlov_av_homework_module_16_number_7_koala.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.samojlov_av_homework_module_16_number_7_koala.R
import com.example.samojlov_av_homework_module_16_number_7_koala.models.Letter

class LetterAdapter(private val list: List<Letter>) :
    RecyclerView.Adapter<LetterAdapter.LetterViewHolder>() {

    private var onLetterClickListener: OnLetterClickListener? = null

    interface OnLetterClickListener {
        fun onLetterClickListener(
            letter: Letter,
            position: Int,
            address: TextView
        )
    }

    class LetterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val address: TextView = itemView.findViewById(R.id.addressTV)
        val themes: TextView = itemView.findViewById(R.id.themesTV)
        val container: CardView = itemView.findViewById(R.id.containerMailItemCV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.mail_item, parent, false)
        return LetterViewHolder(itemView)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
        val address = list[position].address
        val themes = list[position].subject
        holder.address.text = address
        holder.themes.text = themes

        holder.itemView.setOnClickListener {
            if (onLetterClickListener != null) {
                onLetterClickListener!!.onLetterClickListener(
                    list[position],
                    position,
                    holder.address
                )
            }
        }

    }

    fun setLetterClickListener(onLetterClickListener: OnLetterClickListener) {
        this.onLetterClickListener = onLetterClickListener
    }

}