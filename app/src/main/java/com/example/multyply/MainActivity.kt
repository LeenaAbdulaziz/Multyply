package com.example.multyply

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var btn:Button
    lateinit var result:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1=findViewById(R.id.ednum1)
        num2=findViewById(R.id.ednum2)
        btn=findViewById(R.id.button)
        result=findViewById(R.id.textView)




        btn.setOnClickListener {
            var f= num2.text.toString().toDouble()
            var d=num1.text.toString().toFloat()
            var multy=d*f
            result.setText("$multy")
        }
    }
}