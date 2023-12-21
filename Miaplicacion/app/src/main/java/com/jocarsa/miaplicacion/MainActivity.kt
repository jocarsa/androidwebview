package com.jocarsa.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url = "file:///android_asset/index.html"
        val miVistaweb: WebView = findViewById(R.id.vistaweb)
        miVistaweb.settings.javaScriptEnabled = true
        miVistaweb.loadUrl(url)
    }
}