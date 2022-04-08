package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.activities.RateUs
import android.graphics.drawable.ColorDrawable
import androidx.core.content.res.ResourcesCompat

class RateUsDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_privacy)
        val rateUs = Rate(this@RateUsDialog)
        rateUs.window!!.setBackgroundDrawable(ColorDrawable(ResourcesCompat.getColor(resources,android.R.color.transparent,null)))
        rateUs.setCancelable(false)
        rateUs.show()
    }
}