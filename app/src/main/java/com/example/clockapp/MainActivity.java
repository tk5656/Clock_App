package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButton1Press(View view)
    {
        Intent intent = new Intent(this, analog.class);
        startActivity(intent);
    }

    public void onButton2Press(View view)
    {
        Intent intent = new Intent(this, digital.class);
        startActivity(intent);
    }

    public void onButton3Press(View view)
    {
        Intent intent = new Intent(this, stopwatch.class);
        startActivity(intent);
    }
}


