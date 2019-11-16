package com.example.homework2.feature.GitFollowerView

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.R
import com.example.homework2.data.GitFollowerItemData

class FollowerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val ivProfile : ImageView = itemView.findViewById(R.id.iv_followerItem_profile)
    val tvUserId : TextView = itemView.findViewById(R.id.tv_followerId)
    val tvUserName : TextView = itemView.findViewById(R.id.tv_followerName)

    fun bind(data : GitFollowerItemData){
        tvUserId.text = data.userId
        tvUserName.text = data.userName
    }


}