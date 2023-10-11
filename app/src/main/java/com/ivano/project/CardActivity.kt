package com.ivano.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivano.project.databinding.ActivityCardBinding
import com.ivano.project.databinding.ActivityReadBinding

class CardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}