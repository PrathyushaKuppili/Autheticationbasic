package com.prathyusha.autheticationbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    lateinit var username:EditText
    lateinit var emailid:EditText
    lateinit var phone:EditText
    lateinit var pwd:EditText
    lateinit var signup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        username=findViewById(R.id.username)
        emailid=findViewById(R.id.emailid)
        phone=findViewById(R.id.phone)
        pwd=findViewById(R.id.pwd)
        signup=findViewById(R.id.signup)

        signup.setOnClickListener {
            Toast.makeText(this@SignUpActivity,"Clicked on signup button",Toast.LENGTH_SHORT).show()
        }

    }
}