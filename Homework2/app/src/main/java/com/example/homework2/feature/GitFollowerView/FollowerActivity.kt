package com.example.homework2.feature.GitFollowerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.R
import com.example.homework2.data.GitFollowerItemDataRepo


class FollowerActivity : AppCompatActivity() {

    private lateinit var rv_follower : RecyclerView
    private lateinit var rv_follower_adapter : FollowerAdapter
    private val data_follower_rv = GitFollowerItemDataRepo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follower)

        initFollowerRecyclerView()  // follower 리사이클러뷰 초기화
    }

    /** FollowerActivity의 리사이클러뷰 초기화 세팅 */
    private fun initFollowerRecyclerView(){
        rv_follower = findViewById(R.id.rv_follower)
        rv_follower_adapter = FollowerAdapter(this)
        rv_follower.adapter = rv_follower_adapter
        rv_follower.layoutManager = LinearLayoutManager(this)
        rv_follower_adapter.data = data_follower_rv.getFollowerItemData()
        rv_follower_adapter.notifyDataSetChanged()
    }
}
