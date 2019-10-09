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
//        var id  = etSIGNUPid.text
//        var password = etSIGNUPpw.text
//        var pwCheck = etSIGNUPpwcheck.text

        /* 코드 피드백
        *  위의 주석친 코드들의 위치를 setOnClickListener 안으로 넣는 것이 좋을 것 같다!
        *  왜냐하면 signupClick() 함수 자체는 클릭시에 호출되는 함수가 아니라 onCreate() 함수가 실행될 때
        *  호출되도록 짜놓았기 때문에 위 세 변수에는 빈 값이 들어갈 가능성이 있기 때문이다.
        * */

        tvSIGNUPsignup.setOnClickListener {

            val id  = etSIGNUPid.text
            val password = etSIGNUPpw.text
            val pwCheck = etSIGNUPpwcheck.text

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
