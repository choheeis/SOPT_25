package com.example.homework2.feature.GitFollowerView

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.R
import com.example.homework2.data.GitFollowerItemData
import com.example.homework2.feature.GitRepository.GitrepositoryActivity

class FollowerAdapter(private val context : Context) : RecyclerView.Adapter<FollowerViewHolder>() {


    var data = listOf<GitFollowerItemData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_follower, parent, false)
        return FollowerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FollowerViewHolder, position: Int) {
        holder.bind(data[position])
        holder.itemView.setOnClickListener {
            /** 각 아이템 뷰 클릭 시 화면 전환 */
            var intent = Intent(context, GitrepositoryActivity::class.java)
            context.startActivity(intent)
        }
    }



    override fun getItemCount(): Int {
        return data.size
    }


}