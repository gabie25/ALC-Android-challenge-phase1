package com.gabrielleseinzor.challengelearningphase1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {
    WebView webview;
    public static String URL_ALC ="https://andela.com/alc";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webview =(WebView) findViewById(R.id.webview);
        webview = new WebView(this);

        webview.getSettings().setJavaScriptEnabled(true);
        
        webview.loadUrl(URL_ALC);



    }

}
