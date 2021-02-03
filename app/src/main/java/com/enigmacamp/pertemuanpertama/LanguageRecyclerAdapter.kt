package com.enigmacamp.pertemuanpertama

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class LanguageRecyclerAdapter(
    private val languageList: MutableList<String>)
    :RecyclerView.Adapter<LanguageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.language_item_layout, parent, false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return languageList.size
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.orderNumber.text = position.toString()
        holder.languageName.text = languageList[position]
        holder.itemView.setOnClickListener(holder)
    }
}

class LanguageViewHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener {
    val orderNumber: TextView = v.findViewById(R.id.order_number)
    val languageName: TextView = v.findViewById(R.id.language_name)

    override fun onClick(v: View?) {
        Toast.makeText(v?.context, "${languageName.text}", Toast.LENGTH_SHORT).show()
    }
}
