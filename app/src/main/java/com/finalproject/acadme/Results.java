package com.finalproject.acadme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;




public class Results extends AppCompatActivity {


    private WebView myresultsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Results");


        myresultsView=(WebView) findViewById(R.id.results_view);
        myresultsView.setWebViewClient(new WebViewClient());
        myresultsView.loadUrl("https://i.postimg.cc/PJP7yH8m/Rf.png");
        WebSettings webSettings=myresultsView.getSettings();
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
        if(myresultsView.canGoBack()) {
            myresultsView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }

}