package com.veronica.idn.dzikirapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.veronica.idn.dzikirapp.databinding.ItemArtikelBinding
import com.veronica.idn.dzikirapp.databinding.ItemDoaBinding
import com.veronica.idn.dzikirapp.model.DzikirDoa

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>) :
    RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {

    inner class MyViewHolder( var itemDoaBinding: ItemDoaBinding) :
        RecyclerView.ViewHolder(itemDoaBinding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DzikirDoaAdapter.MyViewHolder {
        val itemDoaBinding = ItemDoaBinding
            .inflate(
                LayoutInflater
                    .from(parent.context), parent, false
            )
        return MyViewHolder(itemDoaBinding)
    }

    override fun onBindViewHolder(holder: DzikirDoaAdapter.MyViewHolder, position: Int) {
       val qauliyah = listDzikirDoa[position]
        holder.itemDoaBinding.tvDescItemDoa.text = qauliyah.desc
        holder.itemDoaBinding.tvLafazItemDoa.text = qauliyah.lafaz
        holder.itemDoaBinding.tvTerjemah.text = qauliyah.terjemah
    }

    override fun getItemCount(): Int = listDzikirDoa.size
}