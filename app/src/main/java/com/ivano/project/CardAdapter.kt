package com.ivano.project

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.ivano.project.databinding.ActivityCardBinding
import com.squareup.picasso.Picasso

class CardAdapter() : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {
    class CardViewHolder(val binding: ActivityCardBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val binding = ActivityCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  CardViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Global.cards.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val url =Global.cards[position].foto
        holder.binding.txtJudulCerita.text = Global.cards[position].judul.toString()
        holder.binding.txtPenulis.text = Global.cards[position].penulis.toString()
        holder.binding.txtDesc.text = Global.cards[position].desc.toString()
        with(holder.binding){
            val builder = Picasso.Builder(holder.itemView.context)
            builder.listener{picasso, uri, exception-> exception.printStackTrace()}
            Picasso.get().load(url).into(img)



        }
        holder.binding.btnRead.setOnClickListener {

            val intent = Intent(it.context, ReadActivity::class.java)
            intent.putExtra("index", Global.cards[position].index.toInt())
            intent.putExtra("judul", Global.cards[position].judul.toString())
            intent.putExtra("penulis", Global.cards[position].penulis.toString())
            intent.putExtra("desc", Global.cards[position].desc.toString())
            intent.putExtra("foto", Global.cards[position].foto.toString())
            it.context.startActivity(intent)

        }
    }
}