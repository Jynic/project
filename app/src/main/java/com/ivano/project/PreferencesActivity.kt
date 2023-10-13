package com.ivano.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivano.project.databinding.ActivityPreferencesBinding
import com.ivano.project.databinding.ActivityUserBinding

class PreferencesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreferencesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreferencesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}