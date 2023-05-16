package com.example.pertemuan4


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pertemuan4.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    lateinit var adapter: FragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = FragmentAdapter(supportFragmentManager,lifecycle)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tableLayout, binding.viewPager){tab, position ->
           when(position){
               0 -> tab.text = "Fragment Satu"
               1 -> tab.text = "Fragment Dua"
           }
        }.attach()



    }
}