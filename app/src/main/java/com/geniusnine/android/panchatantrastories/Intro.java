package com.geniusnine.android.panchatantrastories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Intro extends AppCompatActivity {
WebView Introweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Introweb = (WebView) findViewById(R.id.IntroWebView);
        Introweb.setBackgroundColor(0x00000000);
        WebSettings BasicWebSettings = Introweb.getSettings();
        BasicWebSettings.setBuiltInZoomControls(true);
        BasicWebSettings.setJavaScriptEnabled(true);
        Introweb.setWebViewClient(new Intro.WebViewClient());
        Introweb.loadUrl("file:///android_res/raw/intro.html");
    }


    public class WebViewClient extends android.webkit.WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
    }

