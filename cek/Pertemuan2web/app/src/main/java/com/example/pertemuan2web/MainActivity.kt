package com.example.pertemuan2web

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.pertemuan2web.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    lateinit var listview : ListView    Joko
//    lateinit var webview: WebView jOKO

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = listOf("Kacang","Bawang","Sayur")
        val adapter = ArrayAdapter(this,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item,item)

        val spinner = binding.spinner
        spinner.adapter=adapter

        binding.spinner.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val item = parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@MainActivity,"$item", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
//
//        webview = binding.WebView
//        webview. webViewClient = WebViewClient()
//        webview.loadUrl("https://www.google.com")
//
//
//        listview = binding.ListView
//        val list = arrayListOf("joko", "Budi","Anwar", "joki", "Bidi","Anwir","jiko", "Bude","inwir","unwir","juku", "Buda","inwur","ana","sukma","rara","riri","anton","antin","yuhu","james","mahda")
//        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)
//        listview.adapter = adapter
//
//        listview.setOnItemClickListener{parent, view, position, id ->
//            val item = parent.getItemAtPosition(position).toString()
//            Toast.makeText(this, "Item ini namanya : $item", Toast.LENGTH_SHORT).show()
//
//        }

    }
}

