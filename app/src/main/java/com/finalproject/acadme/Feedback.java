package com.finalproject.acadme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;



public class Feedback extends AppCompatActivity {
    private WebView myfbView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Give Feedback");


        myfbView=(WebView) findViewById(R.id.feedback_view);
        myfbView.setWebViewClient(new WebViewClient());
        myfbView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScP0-bLsdxBTardkkfLHreryoqmKbEaNhg21E4fCP9t2jVNBQ/viewform?usp=sf_link");
        WebSettings webSettings=myfbView.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }
    public class mywebClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed(){
        if(myfbView.canGoBack()) {
            myfbView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }

}