package com.ivano.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivano.project.databinding.ActivityKomenBinding

class KomenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKomenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKomenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}