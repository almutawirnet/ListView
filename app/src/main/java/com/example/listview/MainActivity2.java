package com.example.listview;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        webView=findViewById(R.id.webview);
        int position=getIntent().getIntExtra("story_key",0);

        if (position == 0) {
            webView.loadUrl("file:///android_asset/تصدير.html");
        }
        else if (position == 1) {
            webView.loadUrl("file:///android_asset/الباب الأول - أحكام عامة.html");
        }
        else if (position == 2) {
            webView.loadUrl("file:///android_asset/الباب الثاني - الحريات والحقوق الأساسية.html");
        }
        else if (position == 3) {
            webView.loadUrl("file:///android_asset/الباب الثالث - الملكية.html");
        }
        else if (position == 4) {
            webView.loadUrl("file:///android_asset/الباب الرابع - السلطة التشريعية.html");
        }
        else if (position == 5) {
            webView.loadUrl("file:///android_asset/الباب الخامس - السلطة التنفيذية.html");
        }
        else if (position == 6) {
            webView.loadUrl("file:///android_asset/الباب السادس - العلاقات بين السلط.html");
        }
        else if (position == 7) {
            webView.loadUrl("file:///android_asset/الباب السابع - السلطة القضائية.html");
        }
        else if (position == 8) {
            webView.loadUrl("file:///android_asset/الباب الثامن - المحكمة الدستورية.html");
        }
        else if (position == 9) {
            webView.loadUrl("file:///android_asset/الباب التاسع - الجهات والجماعات الترابية الأخرى.html");
        }
        else if (position == 10) {
            webView.loadUrl("file:///android_asset/الباب العاشر - المجلس الأعلى للحسابات.html");
        }
        else if (position == 11) {
            webView.loadUrl("file:///android_asset/الباب الحادي عشر - المجلس الاقتصادي والاجتماعي والبيئي.html");
        }
        else if (position == 12) {
            webView.loadUrl("file:///android_asset/الباب الثاني عشر - الحكامة الجيدة.html");
        }
        else if (position == 13) {
            webView.loadUrl("file:///android_asset/الباب الثالث عشر - مراجعة الدستور.html");
        }
        else if (position == 14) {
            webView.loadUrl("file:///android_asset/الباب الرابع عشر - أحكام انتقالية وختامية.html");
        }
    }
    }

