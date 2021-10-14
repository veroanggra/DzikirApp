package com.veronica.idn.dzikirapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.veronica.idn.dzikirapp.R
import com.veronica.idn.dzikirapp.databinding.ItemArtikelBinding
import com.veronica.idn.dzikirapp.model.Artikel

class ArtikelAdapter(private val listArtikel: ArrayList<Artikel>) :
    RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class MyViewHolder(var itemArtikelBinding: ItemArtikelBinding) :
        RecyclerView.ViewHolder(itemArtikelBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtikelAdapter.MyViewHolder {
        val itemArtikelBinding = ItemArtikelBinding
            .inflate(
                LayoutInflater
                    .from(parent.context), parent, false
            )
        return MyViewHolder(itemArtikelBinding)
    }

    override fun onBindViewHolder(holder: ArtikelAdapter.MyViewHolder, position: Int) {
        holder.itemArtikelBinding.ivArtikel
            .setImageResource(listArtikel[position].imageArtikel)
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listArtikel[position])
        }
    }

    override fun getItemCount(): Int = listArtikel.size
}

interface OnItemClickCallback {
    fun onItemClicked(data: Artikel)
}
