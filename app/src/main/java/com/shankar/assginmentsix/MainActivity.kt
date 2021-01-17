package com.shankar.assginmentsix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var etUserName:EditText
    private lateinit var etPassword:EditText
    private lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etUserName=findViewById(R.id.UserName)
        etPassword=findViewById(R.id.Passqword)
        btnLogin=findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
             val intent=Intent(this,Dashboard()::class.java).apply {

             }
            startActivity(intent)
        }
    }
}