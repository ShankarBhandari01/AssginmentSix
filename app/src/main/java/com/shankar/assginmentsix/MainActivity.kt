package com.shankar.assginmentsix


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.shankar.assginmentsix.model.user

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
            val user = user()
            val forlogin = user.Login(etUserName.text.toString(), etPassword.text.toString())
            if (TextUtils.isEmpty(etUserName.text.toString())){
                etUserName.setError("Username is Required")
                etUserName.requestFocus()
            }else if(TextUtils.isEmpty(etPassword.text.toString())){
                etPassword.setError("Password is Required")
                etPassword.requestFocus()
            }else{
                if(forlogin){
                    startActivity(Intent(this@MainActivity, Dashboard::class.java))
                }
            }

        }
    }
}