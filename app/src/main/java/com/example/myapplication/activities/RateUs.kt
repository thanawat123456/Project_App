package com.example.myapplication.activities

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.myapplication.R
import androidx.appcompat.widget.AppCompatButton
import android.widget.RatingBar
import android.widget.Toast
import android.content.Intent

import android.widget.RatingBar.OnRatingBarChangeListener
import android.view.animation.ScaleAnimation
import android.view.animation.Animation
import android.widget.ImageView

class RateUs(context: Context) : Dialog(context) {
    private var userRate = 0f
    override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate_us)
        val rateNowBtn: AppCompatButton = findViewById(R.id.rateNowBtn)
        val laterBtn: AppCompatButton = findViewById(R.id.laterBtn)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val ratingImage = findViewById<ImageView>(R.id.ratingImage)
        rateNowBtn.setOnClickListener { view ->
            Toast.makeText(
                view.context,
                "ขอบคุณสำหรับการให้คะแนน",
                Toast.LENGTH_SHORT
            ).show()
        }
        laterBtn.setOnClickListener { view ->
            val openThree = Intent(view.context, CentralRecipes::class.java)
            view.context.startActivity(openThree)
        }
        ratingBar.onRatingBarChangeListener =
            OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                if (rating <= 1) {
                    ratingImage.setImageResource(R.drawable.sosad)
                } else if (rating <= 2) {
                    ratingImage.setImageResource(R.drawable.sad)
                } else if (rating <= 3) {
                    ratingImage.setImageResource(R.drawable.normal)
                } else if (rating <= 4) {
                    ratingImage.setImageResource(R.drawable.prehappy)
                } else if (rating <= 5) {
                    ratingImage.setImageResource(R.drawable.happy)
                }
                animateImage(ratingImage)
                userRate = rating
            }
    }

    private fun animateImage(ratingImage: ImageView) {
        val scaleAnimation = ScaleAnimation(
            0f,
            1f,
            0f,
            1f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        scaleAnimation.fillAfter = true
        scaleAnimation.duration = 200
        ratingImage.startAnimation(scaleAnimation)
    }
}