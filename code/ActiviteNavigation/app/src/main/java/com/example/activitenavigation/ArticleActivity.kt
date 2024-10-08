package com.example.activitenavigation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activitenavigation.databinding.ActivityArticleBinding
import com.example.activitenavigation.databinding.ActivityContactBinding
import com.example.activitenavigation.databinding.ActivityMainBinding

class ArticleActivity: AppCompatActivity() {

    private lateinit var binding: ActivityArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContact.setOnClickListener{
            val intent = Intent(this, ActivityContactBinding::class.java)
            startActivity(intent)
        }


}


}