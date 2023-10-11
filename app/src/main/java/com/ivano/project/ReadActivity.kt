package com.ivano.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivano.project.databinding.ActivityReadBinding

class ReadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var judul = intent.getStringExtra("judul")
        var penulis = intent.getStringExtra("penulis")
        var desc = intent.getStringExtra("desc")
        var foto = intent.getStringExtra("foto")
    }
}