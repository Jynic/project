package com.ivano.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ivano.project.databinding.ActivityReadBinding

class ReadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var indexcerita = intent.getIntExtra("index", 2)
        var judul = intent.getStringExtra("judul")
        var penulis = intent.getStringExtra("penulis")
        var desc = intent.getStringExtra("desc")
        var foto = intent.getStringExtra("foto")

        binding.txtJudulCerita.text = judul.toString()
        binding.txtPenulis.text = penulis.toString()
        binding.txtDesc.text = desc.toString()
        binding.txtby.text = indexcerita.toString()

        val lm: LinearLayoutManager = LinearLayoutManager(this)
        binding.recyclerViewKomenRead.layoutManager = lm
        binding.recyclerViewKomenRead.setHasFixedSize(true)
        binding.recyclerViewKomenRead.adapter = KomenAdapter(indexcerita)


    }
}