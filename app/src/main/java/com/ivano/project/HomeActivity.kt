package com.ivano.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ivano.project.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityHomeBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        binding.btngaris.setOnClickListener {
            Toast.makeText(this, "BERHASIL", Toast.LENGTH_SHORT).show().toString()
        }
    }
}