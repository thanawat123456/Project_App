package com.example.myapplication.activities;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

import com.example.myapplication.R;

public class Rate extends Dialog {

    private float userRate = 0;

    public Rate(@NonNull Context context){
        super(context);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);

        final AppCompatButton rateNowBtn = findViewById(R.id.rateNowBtn);
        final AppCompatButton laterBtn = findViewById(R.id.laterBtn);
        final RatingBar ratingBar = findViewById(R.id.ratingBar);
        final ImageView ratingImage = findViewById(R.id.ratingImage);

        rateNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "ขอบคุณสำหรับการให้คะแนน", Toast.LENGTH_SHORT).show();


            }


        });

        laterBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent openThree = new Intent(view.getContext(), CentralRecipes.class);
                view.getContext().startActivity(openThree);
            }
        });


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                if(rating <=1){
                    ratingImage.setImageResource(R.drawable.sosad);
                }
                else if(rating <=2){
                    ratingImage.setImageResource(R.drawable.sad);
                }
                else if(rating <=3){
                    ratingImage.setImageResource(R.drawable.normal);
                }
                else if(rating <=4){
                    ratingImage.setImageResource(R.drawable.prehappy);
                }
                else if(rating <=5){
                    ratingImage.setImageResource(R.drawable.happy);
                }
                animateImage(ratingImage);

                userRate = rating;

            }
        });


    }

    private void animateImage(ImageView ratingImage){
        ScaleAnimation scaleAnimation = new ScaleAnimation(0,1f,0,1f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);

        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(200);
        ratingImage.startAnimation(scaleAnimation);
    }

}