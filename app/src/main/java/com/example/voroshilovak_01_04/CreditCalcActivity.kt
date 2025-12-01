package com.example.voroshilovak_01_04

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

class CreditCalcActivity : AppCompatActivity() {
    lateinit var slider:SeekBar
    lateinit var date:EditText
    lateinit var payment:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit_calc)
    }

    fun Calc(view: View) {
        slider = view.findViewById(R.id.slider)
        date = view.findViewById(R.id.date_in_month)
        payment = view.findViewById(R.id.month_payment)

        var result = 0.0
        when{
            date.text.toString().toDouble()<12 ->{
                result = slider.progress / date.text.toString().toDouble() + slider.progress*0.59
            }
            date.text.toString().toDouble()>12 && date.text.toString().toDouble()<24->{
                var temp = slider.progress / date.text.toString().toDouble() + slider.progress*0.59
                result = temp/date.text.toString().toDouble() + slider.progress*0.51
            }
            date.text.toString().toDouble()>24->{
                var temp = slider.progress / date.text.toString().toDouble() + slider.progress*0.59
                result = temp + slider.progress/date.text.toString().toDouble() + slider.progress*0.42
            }
        }
        payment.text = result.toString()
        intent = Intent(this, InfoActivity::class.java)
    }
}