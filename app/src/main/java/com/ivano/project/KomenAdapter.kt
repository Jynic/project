package com.ivano.project

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ivano.project.databinding.ActivityKomenBinding
import kotlin.math.sign

class KomenAdapter(private var indexx:Int):RecyclerView.Adapter<KomenAdapter.KomenViewHolder>() {
    class KomenViewHolder(val binding: ActivityKomenBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomenViewHolder {
        val binding = ActivityKomenBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KomenViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Global.komens.count{indexx == it.indexcerita}
    }

    override fun onBindViewHolder(holder: KomenViewHolder, position: Int) {

        for (ind in indexx..indexx+itemCount-1){
            holder.binding.txtKomen.text = Global.komens[ind].komen.toString()
            holder.binding.txtPenulisKomen.text = Global.komens[ind].penulis.toString()
        }

    }
}