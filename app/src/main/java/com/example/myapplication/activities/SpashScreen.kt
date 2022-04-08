package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import android.content.Intent
import android.os.Handler
import com.example.myapplication.activities.Home

class SpashScreen : AppCompatActivity() {
    var handler: Handler? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash_screen)
        handler = Handler()
        handler!!.postDelayed({ startActivity(Intent(this@SpashScreen, Home::class.java)) }, 4000)
    }
}