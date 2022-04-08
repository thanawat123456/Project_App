package com.example.myapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class Home : AppCompatActivity() {

    var bhome : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bhome = findViewById(R.id.btnHome) as Button

        bhome!!.setOnClickListener{
            var intent = Intent(this,CentralRecipes::class.java)
            startActivity(intent)
        }
    }
}