package com.skh.song.sopt_week1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt_login_id.setOnFocusChangeListener { v, hasFocus ->

            if(hasFocus==true){
                v.setBackgroundResource(R.drawable.primary_border)
            }
            else{
                v.setBackgroundResource(R.drawable.gray_border)
            }
        }
        edt_login_password.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus==true){
                v.setBackgroundResource(R.drawable.primary_border)
            }
            else{
                v.setBackgroundResource(R.drawable.gray_border)
            }
        }

        btn_login_submit.setOnClickListener {

            if(edt_login_id.text.toString()==""){
                edt_login_id.requestFocus()//포커스를 줌
            }
            else if(edt_login_password.text.toString()=="") {
                edt_login_password.requestFocus()

            }
            else {
                finish()
            }
        }

    }
}
