package com.ivano.project

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ivano.project.databinding.ActivityKomenBinding

class KomenAdapter():RecyclerView.Adapter<KomenAdapter.KomenViewHolder>() {
    class KomenViewHolder(val binding: ActivityKomenBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomenViewHolder {
        val binding = ActivityKomenBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KomenViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Global.komen.size
    }

    override fun onBindViewHolder(holder: KomenViewHolder, position: Int) {
        holder.binding.txtKomen.text =Global.komen[position].komen.toString()
        holder.binding.txtPenulisKomen.text = Global.komen[position].penulis.toString()
    }
}