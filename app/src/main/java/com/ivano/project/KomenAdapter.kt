package com.ivano.project

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.ivano.project.databinding.ActivityKomenBinding
import kotlinx.coroutines.processNextEventInCurrentThread
import kotlin.math.sign
import android.view.View

class KomenAdapter(private var indexx:Int):RecyclerView.Adapter<KomenAdapter.KomenViewHolder>() {
    class KomenViewHolder(val binding: ActivityKomenBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomenViewHolder {
        val binding = ActivityKomenBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KomenViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Global.komens.size
    }

    override fun onBindViewHolder(holder: KomenViewHolder, position: Int) {

        if(indexx == Global.komens[position].indexcerita){
            holder.binding.txtKomen.text = Global.komens[position].komen.toString()
            holder.binding.txtPenulisKomen.text = Global.komens[position].penulis.toString()
            holder.itemView.visibility = View.VISIBLE
        }
        else{
            holder.itemView.isActivated = false
        }

    }
}