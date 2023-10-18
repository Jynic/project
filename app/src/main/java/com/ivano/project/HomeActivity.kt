package com.ivano.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.ivano.project.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityHomeBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        binding.recyclerView.isVisible = false
//        val lm: LinearLayoutManager = LinearLayoutManager(this)
//        binding.recyclerView.layoutManager = lm
//        binding.recyclerView.setHasFixedSize(true)
//        binding.recyclerView.adapter = KomenAdapter()

        val lm2: LinearLayoutManager = LinearLayoutManager(this)
        binding.recyclerViewCard.layoutManager = lm2
        binding.recyclerViewCard.setHasFixedSize(true)
        binding.recyclerViewCard.adapter = CardAdapter()

        binding.btnCreate.setOnClickListener {
            val intent = Intent(it.context,CreateCerbung1Activity::class.java)
            it.context.startActivity(intent)
        }
    }
}