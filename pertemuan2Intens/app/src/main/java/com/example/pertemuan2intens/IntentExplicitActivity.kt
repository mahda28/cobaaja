package com.example.pertemuan2intens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.pertemuan2intens.databinding.ActivityIntentExplicitBinding

class IntentExplicitActivity : AppCompatActivity() {
    lateinit var binding : ActivityIntentExplicitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentExplicitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val t_nomor = binding.tampilNomor
        val t_nama = binding.tampilNama

        t_nomor.setText(intent.getStringExtra("nomor"))
        t_nama.setText(intent.getStringExtra("nama"))

    }
}