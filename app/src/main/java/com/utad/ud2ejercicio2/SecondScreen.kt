package com.utad.ud2ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.utad.ud2ejercicio2.Constants.NAV_TEXTO
import com.utad.ud2ejercicio2.databinding.ActivityMain2Binding


class SecondScreen : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvShowText.text = NAV_TEXTO
        binding.btnIrHome.setOnClickListener {
            val intent = Intent(this, ThirdScreen::class.java)
            startActivity(intent)
        }
    }
}