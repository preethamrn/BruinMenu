package com.rhombus.bruinmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.concurrent.TimeUnit;

public class NutriDataWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Activity activity = this;
        try {
            setContentView(R.layout.activity_nutri_data_web_view);

            Intent intent = getIntent();
            String html = "<link rel=\"stylesheet\" type=\"text/css\" href=\"nutristyle.css\" />" + intent.getStringExtra("html");

            WebView webview = new WebView(this);
            setContentView(webview);
            WebSettings webSettings = webview.getSettings();

            webSettings.setJavaScriptEnabled(true);
            webSettings.setLoadWithOverviewMode(true);

            webview.loadDataWithBaseURL("file:///android_asset/", html, "text/html", "UTF-8", "");
        } catch (Exception e) {
            Toast.makeText(activity, "If you got here, something is horribly wrong.", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
