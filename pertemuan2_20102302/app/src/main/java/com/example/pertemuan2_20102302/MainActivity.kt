package com.example.pertemuan2_20102302

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.pertemuan2_20102302.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var webview: WebView
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          binding =ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

        webview = binding.WebView
        webview. webViewClient = WebViewClient()
        webview.loadUrl("https://www.google.com")
    }
}