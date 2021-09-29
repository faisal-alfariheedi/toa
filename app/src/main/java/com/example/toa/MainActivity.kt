package com.example.toa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var na: EditText
        lateinit var em: EditText
        lateinit var tos: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        na = findViewById(R.id.Name)
        em = findViewById(R.id.email)
        tos = findViewById(R.id.tos)

        tos.setOnClickListener{
            Toast.makeText(applicationContext, "${na.text.toString() +" " + em.text.toString()}",Toast.LENGTH_SHORT).show()
        }

    }
}