package com.example.pertemuan2intens

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan2intens.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edit_nomor = binding.editNomor
        val edit_nama = binding.editNama

        binding.btnIntent.setOnClickListener{
            startActivity(Intent(this, IntentActivity::class.java))
        }
        binding.btnIntentExplicit.setOnClickListener{
            val intent = Intent(this,IntentExplicitActivity::class.java)
            intent.putExtra("nomor",edit_nomor.text.toString())
            intent.putExtra("nama", edit_nama.text.toString())
            startActivity((intent))
        }
        binding.btnIntentExplicitBundle.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nomor",edit_nomor.text.toString())
            bundle.putString("nama",edit_nama.text.toString())
            val intent = Intent(this, IntentExplicitBundleActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        binding.btnIntentImplicit.setOnClickListener{
            val panggil_nomor = edit_nomor.text.toString()
            val Dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$panggil_nomor"))
            startActivity(Dial)
        }

    }

}