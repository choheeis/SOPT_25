package com.example.homework1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signupClick()   // 회원가입 버튼 클릭 리스너
    }

    /** 회원가입 버튼 클릭 리스너 */
    fun signupClick(){
        var id  = etSIGNUPid.text
        var password = etSIGNUPpw.text
        var pwCheck = etSIGNUPpwcheck.text

        tvSIGNUPsignup.setOnClickListener {
            // 하나라도 입력하지 않은 경우 or 비밀번호 확인이 일치하지 않은 경우
            if(etSIGNUPnm.text.toString().isEmpty() || etSIGNUPid.text.toString().isEmpty() || etSIGNUPpw.text.toString().isEmpty() || etSIGNUPpwcheck.text.toString().isEmpty()){
                Toast.makeText(this, "회원가입 정보를 모두 입력해주세요.", Toast.LENGTH_SHORT).show()
            }else if(password.toString() != pwCheck.toString()){
                Toast.makeText(this, "비밀번호 확인을 다시 해주세요.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "회원가입 완료! ", Toast.LENGTH_SHORT).show()

                // intent 로 데이터 넘기기
                var intent = Intent()
                intent.putExtra("id", id.toString())
                intent.putExtra("password", password.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}
