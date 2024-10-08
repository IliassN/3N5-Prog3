package com.example.activitenavigation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activitenavigation.databinding.ActivityArticleBinding
import com.example.activitenavigation.databinding.ActivityContactBinding
import com.example.activitenavigation.databinding.ActivityMainBinding

class ContactActivity: AppCompatActivity() {

    private lateinit var binding : ActivityContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAccueil.setOnClickListener{
            val intent = Intent(this, ActivityMainBinding::class.java)
            startActivity(intent)
        }
    }

}