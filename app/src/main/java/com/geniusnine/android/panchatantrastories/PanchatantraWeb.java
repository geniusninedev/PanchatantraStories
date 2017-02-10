package com.geniusnine.android.panchatantrastories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PanchatantraWeb extends AppCompatActivity {
WebView PanchaWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panchatantra_web);
        PanchaWeb = (WebView) findViewById(R.id.PanWebView);
        PanchaWeb.setBackgroundColor(0x00000000);
        WebSettings BasicWebSettings =PanchaWeb.getSettings();
        BasicWebSettings.setBuiltInZoomControls(true);
        BasicWebSettings.setJavaScriptEnabled(true);
        PanchaWeb.setWebViewClient(new PanchatantraWeb.WebViewClient());
        int position = getIntent().getIntExtra("key", 0);
        if (position == 0) {
            PanchaWeb.loadUrl("file:///android_res/raw/p1.html");
        }  else if (position == 1) {
            PanchaWeb.loadUrl("file:///android_res/raw/p2.html");
        }else if (position == 2) {
            PanchaWeb.loadUrl("file:///android_res/raw/p3.html");
        }
        else if (position == 3) {
            PanchaWeb.loadUrl("file:///android_res/raw/p6.html");
        }
        else if (position == 4) {
            PanchaWeb.loadUrl("file:///android_res/raw/p8.html");
        }else if (position == 5) {
            PanchaWeb.loadUrl("file:///android_res/raw/p13.html");
        }else if (position == 6) {
            PanchaWeb.loadUrl("file:///android_res/raw/p17.html");
        } else if (position == 7) {
            PanchaWeb.loadUrl("file:///android_res/raw/p22.html");
        } else if (position == 8) {
            PanchaWeb.loadUrl("file:///android_res/raw/p24.html");
        }else if (position == 9) {
            PanchaWeb.loadUrl("file:///android_res/raw/p28.html");
        }else if (position == 10) {
            PanchaWeb.loadUrl("file:///android_res/raw/p32.html");
        }else if (position == 11) {
            PanchaWeb.loadUrl("file:///android_res/raw/p35.html");
        }else if (position == 12) {
            PanchaWeb.loadUrl("file:///android_res/raw/p37.html");
        } else if (position == 13) {
            PanchaWeb.loadUrl("file:///android_res/raw/p42.html");
        }else if (position == 14) {
            PanchaWeb.loadUrl("file:///android_res/raw/p49.html");
        }else if (position == 15) {
            PanchaWeb.loadUrl("file:///android_res/raw/p52.html");
        } else if (position == 16) {
            PanchaWeb.loadUrl("file:///android_res/raw/p54.html");
        }else if (position == 17) {
            PanchaWeb.loadUrl("file:///android_res/raw/p58.html");
        }else if (position == 18) {
            PanchaWeb.loadUrl("file:///android_res/raw/p61.html");
        }else if (position == 19) {
            PanchaWeb.loadUrl("file:///android_res/raw/p63.html");
        }else if (position == 20) {
            PanchaWeb.loadUrl("file:///android_res/raw/p66.html");
        }else if (position == 21) {
            PanchaWeb.loadUrl("file:///android_res/raw/p68.html");
        }else if (position == 22) {
            PanchaWeb.loadUrl("file:///android_res/raw/p70.html");
        }else if (position == 23) {
            PanchaWeb.loadUrl("file:///android_res/raw/p72.html");
        }else if (position == 24) {
            PanchaWeb.loadUrl("file:///android_res/raw/p77.html");
        }else if (position == 25) {
            PanchaWeb.loadUrl("file:///android_res/raw/p81.html");
        }else if (position == 26) {
            PanchaWeb.loadUrl("file:///android_res/raw/p83.html");
        }else if (position == 27) {
            PanchaWeb.loadUrl("file:///android_res/raw/p86.html");
        }else if (position == 28) {
            PanchaWeb.loadUrl("file:///android_res/raw/p89.html");
        }else if (position == 29) {
            PanchaWeb.loadUrl("file:///android_res/raw/p92.html");
        }else if (position == 30) {
            PanchaWeb.loadUrl("file:///android_res/raw/p95.html");
        }else if (position == 31) {
            PanchaWeb.loadUrl("file:///android_res/raw/p99.html");
        }else if (position == 32) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa1.html");
        }else if (position == 33) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa3.html");
        }else if (position == 34) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa6.html");
        }else if (position == 35) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa9.html");
        }else if (position == 36) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa12.html");
        }else if (position == 37) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa15.html");
        }else if (position == 38) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa18.html");
        }else if (position == 39) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa22.html");
        }else if (position == 40) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa26.html");
        }else if (position == 41) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa29.html");
        }else if (position == 42) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa31.html");
        }else if (position == 43) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa33.html");
        }else if (position == 44) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa36.html");
        }else if (position == 45) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa38.html");
        }else if (position == 46) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa41.html");
        }else if (position == 47) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa43.html");
        }else if (position == 48) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa45.html");
        }else if (position == 49) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa49.html");
        }else if (position == 50) {
            PanchaWeb.loadUrl("file:///android_res/raw/pa52.html");
        }else if (position == 51) {
            PanchaWeb.loadUrl("file:///android_res/raw/agung.html");
        }else if (position == 52) {
            PanchaWeb.loadUrl("file:///android_res/raw/agun.html");
        }else if (position == 53) {
            PanchaWeb.loadUrl("file:///android_res/raw/cas.html");
        }else if (position == 54) {
            PanchaWeb.loadUrl("file:///android_res/raw/clap.html");
        }else if (position == 55) {
            PanchaWeb.loadUrl("file:///android_res/raw/glock.html");
        }else if (position == 56) {
            PanchaWeb.loadUrl("file:///android_res/raw/hand.html");
        }else if (position == 57) {
            PanchaWeb.loadUrl("file:///android_res/raw/mbira.html");
        }else if (position == 58) {
            PanchaWeb.loadUrl("file:///android_res/raw/triangle.html");
        }else if (position == 59) {
            PanchaWeb.loadUrl("file:///android_res/raw/wood.html");
        }else if (position == 60) {
            PanchaWeb.loadUrl("file:///android_res/raw/agida.html");
        }else if (position == 61) {
            PanchaWeb.loadUrl("file:///android_res/raw/cuica.html");
        }else if (position == 62) {
            PanchaWeb.loadUrl("file:///android_res/raw/dabakan.html");
        }else if (position == 63) {
            PanchaWeb.loadUrl("file:///android_res/raw/drumkit.html");
        }
    }


    public class WebViewClient extends android.webkit.WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
