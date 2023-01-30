package com.example.slyusarevflowers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class win1 extends AppCompatActivity {
    private Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win1);
        mbutton = findViewById(R.id.button2);
        mbutton.setOnClickListener(v -> {
            Intent oknoW = new Intent(this, MainActivity.class);
            startActivity(oknoW);
            finish();
        });
    }
}