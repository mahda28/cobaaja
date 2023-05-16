package com.example.pertemuan2intens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan2intens.databinding.ActivityIntentExplicitBundleBinding

class IntentExplicitBundleActivity : AppCompatActivity() {
lateinit var  binding: ActivityIntentExplicitBundleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentExplicitBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val t_nomor = binding.tampilNomor
        val t_nama = binding.tampilNama

        val  bundle = intent.extras
        t_nomor.setText(bundle?.getString("nomor"))
        t_nama.setText(bundle?.getString("nama"))

    }
}