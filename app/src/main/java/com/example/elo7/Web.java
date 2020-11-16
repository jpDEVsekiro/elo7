package com.example.elo7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView=(WebView)findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        Intent intent=getIntent();
        String nome=intent.getExtras().getString("title");
        String url=intent.getExtras().getString("url");
        webView.loadUrl(url);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Toolbar toolbar = (Toolbar)findViewById(R.id.webtool);
        setSupportActionBar(toolbar);
        Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
        upArrow.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//coloco a seta de voltar na barra
        getSupportActionBar().setTitle(nome);
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
        super.onBackPressed();}
    }
}