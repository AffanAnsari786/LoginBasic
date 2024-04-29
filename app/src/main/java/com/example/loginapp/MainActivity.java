package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usernameText;
    EditText passwordText;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameText = findViewById(R.id.username_input);
        passwordText = findViewById(R.id.password_input);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the username from EditText
                String username = usernameText.getText().toString();

                // Start WelcomeActivity and pass the username as an extra
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }
}
