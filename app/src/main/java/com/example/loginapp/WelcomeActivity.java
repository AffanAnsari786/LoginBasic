package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView welcomeText = findViewById(R.id.welcomeText);

        // Retrieve the username passed from MainActivity
        String name = getIntent().getStringExtra("USERNAME");

        // Set the welcome message
        welcomeText.setText("Hello " + name);
    }
}
