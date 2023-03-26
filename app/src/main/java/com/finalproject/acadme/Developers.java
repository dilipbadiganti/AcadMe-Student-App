package com.finalproject.acadme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;



public class Developers extends AppCompatActivity {
    private WebView mydevView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Developers");


        mydevView=(WebView) findViewById(R.id.developer_view);
        mydevView.setWebViewClient(new WebViewClient());
        mydevView.loadUrl("https://i.postimg.cc/yYLPdcMb/devs.png");
        WebSettings webSettings=mydevView.getSettings();
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
        if(mydevView.canGoBack()) {
            mydevView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }

}