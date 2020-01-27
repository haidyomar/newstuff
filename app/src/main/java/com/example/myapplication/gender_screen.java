package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class gender_screen extends AppCompatActivity {

    Button femaleButton;
    Button maleButton;
    Button transButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender_screen);


        femaleButton = findViewById(R.id.fButton);
        femaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent (gender_screen.this,female_screen.class);
                startActivity(intent_one);
            }
        });

        maleButton = findViewById(R.id.mButton);
        maleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_three = new Intent(gender_screen.this,male_screen.class);
                startActivity(intent_three);
            }
        });

        transButton = findViewById(R.id.tButton);
        transButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_four = new Intent(gender_screen.this,trans_screen.class);
                startActivity(intent_four);
            }
        });





    }
}
