package com.muniu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webPageAccess extends AppCompatActivity {

    private WebView webView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page_access);

        webView1 =(WebView) findViewById(R.id.webView1);




        //open browser in app
        webView1.setWebViewClient(new MyBrowser());
        final String url = "https://www.techcamp.co.ke";
        webView1.getSettings().getLoadsImagesAutomatically();
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView1.loadUrl(url);




        class MyBrowser extends WebViewClient {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

        }



    }
}
