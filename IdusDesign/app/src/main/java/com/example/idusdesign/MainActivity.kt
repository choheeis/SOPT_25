package com.example.idusdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvLikeGoldClass : RecyclerView
    private lateinit var rvNewGoldClass : RecyclerView
    private lateinit var rvLikeGoldClassAdapter: GoldClassAdapter
    private lateinit var rvNewGoldClassAdapter: GoldClassAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_goldclass)

        initGoldClassRecyclerView()
    }

    /** 인기 금손 클래스, 새로운 금손 클래스 리사이클러뷰 초기화 세팅 및 데이터 삽입 */
    fun initGoldClassRecyclerView(){
        rvLikeGoldClass = findViewById(R.id.rv_like_goldclass)
        rvNewGoldClass = findViewById(R.id.rv_new_goldclass)

        rvLikeGoldClassAdapter = GoldClassAdapter(this)
        rvNewGoldClassAdapter = GoldClassAdapter(this)

        rvLikeGoldClass.adapter = rvLikeGoldClassAdapter
        rvNewGoldClass.adapter = rvNewGoldClassAdapter

        rvLikeGoldClass.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvNewGoldClass.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        rvLikeGoldClassAdapter.data = listOf(
            GoldClassItemData(
                ivThumbnail = R.drawable.img_1,
                ivProfile = R.drawable.profile_1,
                tvTitle = "통통 다쿠아즈 만들기",
                tvStore = "메르시오브"
            ),
            GoldClassItemData(
                ivThumbnail = R.drawable.img_2,
                ivProfile = R.drawable.profile_2,
                tvTitle = "레터링케이크",
                tvStore = "메르시오브"
            )
        )
        rvNewGoldClassAdapter.data = listOf(
            GoldClassItemData(
                ivThumbnail = R.drawable.img_3,
                ivProfile = R.drawable.profile_1,
                tvTitle = "꾸덕,쫀득 마카롱 원데이",
                tvStore = "해블랑디저트"
            ),
            GoldClassItemData(
                ivThumbnail = R.drawable.img_3,
                ivProfile = R.drawable.profile_2,
                tvTitle = "까눌레클래스",
                tvStore = "다앤하"
            )
        )

        rvNewGoldClassAdapter.notifyDataSetChanged()
        rvLikeGoldClassAdapter.notifyDataSetChanged()
    }
}
