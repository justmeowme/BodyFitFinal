package com.example.bodyfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    Button mButtonLose, mButtonGain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mButtonLose = findViewById(R.id.button_lose);
        mButtonLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, AskActivity.class);
                startActivity(intent);
            }
        });

        mButtonGain = findViewById(R.id.button_gain);
        mButtonGain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, AskActivity.class);
                startActivity(intent);
            }
        });

    }
}