package com.example.homework2.feature.GitRepository

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.R
import com.example.homework2.data.GitrepositoryItemData
import com.example.homework2.data.GitrepositoryItemDataRepo

class GitrepositoryActivity : AppCompatActivity() {

    private lateinit var rv_main: RecyclerView
    private lateinit var rv_Adapter: GitrepositoryAdapter
    private val data_gitrepository_rv = GitrepositoryItemDataRepo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gitrepository)

        initRepositoryRecyclerView()
    }

    private fun initRepositoryRecyclerView(){
        rv_main = findViewById(R.id.rv_gitrepository)
        rv_Adapter = GitrepositoryAdapter(this)
        rv_main.adapter = rv_Adapter
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_Adapter.data = data_gitrepository_rv.getGitrepositoryData()
        rv_Adapter.notifyDataSetChanged()
    }
}
