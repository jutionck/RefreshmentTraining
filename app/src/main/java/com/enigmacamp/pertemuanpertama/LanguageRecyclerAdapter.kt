package com.enigmacamp.pertemuanpertama

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.language_item_layout.view.*

class LanguageRecyclerAdapter(private val listLanguage: MutableList<String>) :  RecyclerView.Adapter<LanguageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.language_item_layout, parent, false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount() = listLanguage.size

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.orderNumber.text = position.toString()
        holder.languageName.text = listLanguage[position]
        holder.itemView.setOnClickListener{ holder }
        holder.itemView.delete_button.setOnClickListener {
            notifyItemRemoved(position)
        }
    }
}


