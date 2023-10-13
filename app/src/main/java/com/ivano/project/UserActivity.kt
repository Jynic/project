package com.ivano.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivano.project.databinding.ActivityReadBinding
import com.ivano.project.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}