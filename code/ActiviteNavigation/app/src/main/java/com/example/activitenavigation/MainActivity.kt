package com.example.activitenavigation

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitenavigation.databinding.ActivityArticleBinding
import com.example.activitenavigation.databinding.ActivityContactBinding
import com.example.activitenavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnArticle.setOnClickListener{
            val intent = Intent(this, ActivityArticleBinding::class.java)
            startActivity(intent)
        }

        binding.btnContact.setOnClickListener{
            val intent = Intent(this, ActivityContactBinding::class.java)
            startActivity(intent)
        }

      }
    }
