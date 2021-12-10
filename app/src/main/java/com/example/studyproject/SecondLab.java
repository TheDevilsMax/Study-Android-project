package com.example.studyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class SecondLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_lab);
    }

    public void onClick(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Button button = (Button) findViewById(R.id.button);
        if(imageView.getVisibility() == View.INVISIBLE){
            button.setText("Убрать несквик");
            imageView.setVisibility(View.VISIBLE);
        }
        else if(imageView.getVisibility() == View.VISIBLE){
            button.setText("Показать несквик");
            imageView.setVisibility(View.INVISIBLE);
        }
    }
}