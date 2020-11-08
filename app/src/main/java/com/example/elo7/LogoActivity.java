package com.example.elo7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        new Handler().postDelayed(new Runnable() {//crio uma nova thead para que tela do logo fique aberto só 5 segundos
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(),MainActivity.class)); //abro MainActivity
                finish();// fecho a activity da logo

            }
        },3000);
    }
}