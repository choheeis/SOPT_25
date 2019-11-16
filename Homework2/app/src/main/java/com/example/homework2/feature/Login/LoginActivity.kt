package com.example.homework2.feature.Login

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.homework2.R
import com.example.homework2.feature.GitFollowerView.FollowerActivity
import com.example.homework2.feature.Signup.SignupActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object {
        const val SIGNUP_REQUEST = 1 // intent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initLoginClick() // 로그인 버튼 클릭 함수
        initSignupClick() // 회원가입 버튼 클릭 함수
        /* 코드 피드백
        로그인 버튼 클릭 리스너 함수와 회원가입 버튼 클릭 리스너 함수의 이름을 loginClick(), signupClick() 이라고 지었었다.
        그런데 이 함수들은 실제로 로그인버튼과 회원가입 버튼을 클릭했을 때 호출되는 함수가 아닌 onCreate 함수가 호출될 때 호출되는 함수이므로
        함수의 이름을 initLoginClick(), initSignupClick() 이라고 바꾸는 것이 좋을 것 같다!
        * */
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == SIGNUP_REQUEST){
            if(resultCode == Activity.RESULT_OK){
                // 인텐트로 넘어온 id, pw 데이터 받기
                GET_ID_PASSWD_FROM_INTENT(data)
            }
        }
    }

    private fun GET_ID_PASSWD_FROM_INTENT(data: Intent?) {
        val id = data?.getStringExtra("id")!!.toString()
        val pw = data.getStringExtra("password")!!.toString()
        etLOGINid.setText(id)
        etLOGINpw.setText(pw)
    }

    /** 로그인 버튼 클릭 리스너*/
    fun initLoginClick(){
        tvLOGINlogin.setOnClickListener {
            // 아이디 비밀번호 중 하나라도 입력을 안 한 경우
            Log.d("chohee", etLOGINid.text.toString())
            if(etLOGINid.text.toString().isEmpty() || etLOGINpw.text.toString().isEmpty()){
                Toast.makeText(this, "아이디와 비밀번호를 모두 입력해주세요." , Toast.LENGTH_SHORT).show()
            }else{
                var intent = Intent(this, FollowerActivity::class.java)
                startActivity(intent)
            }
        }
    }

    /** 회원가입 버튼 클릭 리스너 */
    fun initSignupClick(){
        tvLOGINsignup.setOnClickListener {
            var intent = Intent(this, SignupActivity::class.java)
            startActivityForResult(intent, SIGNUP_REQUEST)
        }
    }

}
