package com.prathyusha.autheticationbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var logemailid:EditText
    lateinit var logpwd:EditText
    lateinit var login:Button
    lateinit var txtnotuse:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        logemailid=findViewById(R.id.logemailid)
        logpwd=findViewById(R.id.logpwd)
        login=findViewById(R.id.login)
        txtnotuse=findViewById(R.id.txtnotuse)
        login.setOnClickListener {
            //val intent=Intent(this@LoginActivity,MainActivity::class.java)
            Toast.makeText(this@LoginActivity,"Login Succesfull",Toast.LENGTH_SHORT).show()
        }
        txtnotuse.setOnClickListener {
            val intent=Intent(this@LoginActivity,SignUpActivity::class.java)
        }


    }
}