package com.example.studyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ImageView;
import android.graphics.drawable.AnimationDrawable;

public class FourthLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_lab);
        ImageView img = (ImageView)findViewById(R.id.gooseView);
        img.setBackgroundResource(R.drawable.goose_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        frameAnimation.setOneShot(false);
        frameAnimation.start();
    }
}