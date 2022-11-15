package com.utad.ud2ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.utad.ud2ejercicio2.Constants.NAV_TEXTO
import com.utad.ud2ejercicio2.databinding.ActivityMainBinding

class FirstScreen : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, SecondScreen::class.java)
        startActivity(intent)
        findViewById<TextView>(R.id.tvShowText)

        binding.btnIrAdelante.setOnClickListener {
            val intent = Intent(this, FirstScreen::class.java)
            NAV_TEXTO = binding.etAddText.text.toString()
            startActivity(intent)
        }
    }
}