package org.depinfo.albums.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.exorecyclerview1.databinding.AlbumTitreBinding

class AlbumAdapter : ListAdapter<String, AlbumAdapter.AlbumViewHolder>(AlbumDiffCallback) {

    inner class AlbumViewHolder(private val binding: AlbumTitreBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            // Associe le nom de l'album à la TextView
            binding.albumTitre.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        // Crée une vue pour chaque élément de la liste
        val binding = AlbumTitreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlbumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        // Lier l'album à la vue lorsqu'il est visible
        val item: String = getItem(position)
        holder.bind(item)
    }
}

object AlbumDiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}