package com.example.elo7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("");//tiro titulo da action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //coloco a seta de voltar na bar


    }
}