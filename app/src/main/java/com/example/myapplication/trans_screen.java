package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trans_screen extends AppCompatActivity {

    Button backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.female_screen);


        backButton = findViewById(R.id.bButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_two = new Intent(trans_screen.this,gender_screen.class);
                startActivity(intent_two);


            }
        }); {

        }
    }
}