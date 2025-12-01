package com.example.voroshilovak_01_04

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var login:EditText
    lateinit var password:EditText
    lateinit var help:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun Welcome(view: View) {
        login = view.findViewById(R.id.login)
        password = view.findViewById(R.id.password)
        help = view.findViewById(R.id.help)

        if (login.text.isNotEmpty() && password.text.isNotEmpty()){
            help.visibility = View.INVISIBLE
            intent = Intent(this, CreditCalcActivity::class.java)
        }
        else{
            help.visibility = View.VISIBLE
        }
    }
}