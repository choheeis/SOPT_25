package com.example.homework1

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object {
        const val SIGNUP_REQUEST = 1 // intent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginClick() // 로그인 버튼 클릭 함수
        signupClick() // 회원가입 버튼 클릭 함수
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == SIGNUP_REQUEST){
            if(resultCode == Activity.RESULT_OK){
                // 인텐트로 넘어온 id, pw 데이터 받기
                val id = data?.getStringExtra("id")!!.toString()
                val pw  = data.getStringExtra("password")!!.toString()
                etLOGINid.setText(id)
                etLOGINpw.setText(pw)
            }
        }
    }

    /** 로그인 버튼 클릭 리스너*/
    fun loginClick(){
        tvLOGINlogin.setOnClickListener {
            // 아이디 비밀번호 중 하나라도 입력을 안 한 경우
            Log.d("chohee", etLOGINid.text.toString())
            if(etLOGINid.text.toString().isEmpty() || etLOGINpw.text.toString().isEmpty()){
                Toast.makeText(this, "아이디와 비밀번호를 모두 입력해주세요." , Toast.LENGTH_SHORT).show()
            }else{
                var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }

    /** 회원가입 버튼 클릭 리스너 */
    fun signupClick(){
        tvLOGINsignup.setOnClickListener {
            var intent = Intent(this, SignupActivity::class.java)
            startActivityForResult(intent, SIGNUP_REQUEST)
        }
    }

}
