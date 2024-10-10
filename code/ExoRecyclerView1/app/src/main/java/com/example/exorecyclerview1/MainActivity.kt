package com.example.exorecyclerview1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exorecyclerview1.databinding.ActivityMainBinding
import org.depinfo.albums.adapters.AlbumAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: AlbumAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecycler()
        filRecycler()
     }
     private fun setupRecycler() {
         adapter = AlbumAdapter()
         binding.recyclerView.adapter = adapter
         binding.recyclerView.setHasFixedSize(true)
         binding.recyclerView.addItemDecoration(
             DividerItemDecoration(
                 binding.recyclerView.context, DividerItemDecoration.VERTICAL
             )
         )
     }
    private fun filRecycler(){
        val albums: MutableList<String> = mutableListOf(
            "Antigéographiquement",
            "J'ai Bu",
            "Comment Debord",
            "Darlène",
            "La Nuit Est Une Panthère",
            "Jaune"
        )
        adapter.submitList(albums)
    }

    }
