package com.example.polihack2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

val realpw="realpassword"
val realemail="realemail@gmail.com"

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val buttonlogin = findViewById(R.id.login_button) as Button
        /**buttonlogin.setOnClickListener{
            intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }*/
        var email = findViewById(R.id.email) as EditText
        var password = findViewById(R.id.password) as EditText
        var login_button = findViewById(R.id.login_button) as Button
        login_button.setOnClickListener{

        }
    }
}