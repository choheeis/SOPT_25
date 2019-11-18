package com.example.idusdesign

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class GoldClassAdapter(private val context : Context) : RecyclerView.Adapter<GoldClassViewHolder>() {

    var data = listOf<GoldClassItemData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoldClassViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_goldclass, parent, false)
        return GoldClassViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: GoldClassViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}