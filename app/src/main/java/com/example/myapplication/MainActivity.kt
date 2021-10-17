package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text=""
        button.setOnClickListener {
            try {

                text+=editTextTextPersonName.text.toString()+"\n"
                textView.text=text

            }catch (e:Exception){
                Toast.makeText(applicationContext, "please enter text", Toast.LENGTH_SHORT).show()
            }
        }

    }
}