package com.ivano.project

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import androidx.recyclerview.widget.LinearLayoutManager
import com.ivano.project.databinding.ActivityCreateCerbung2Binding

class CreateCerbung2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateCerbung2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCerbung2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var access = ""
        var paragraf = binding.txtFirstPara.text.toString()
        val title = intent.getStringExtra("title")
        val desc = intent.getStringExtra("desc")
        val url = intent.getStringExtra("url")
        val genre = intent.getStringExtra("genre")


        binding.groupAccess.setOnCheckedChangeListener { radioGroup, id ->
            var selectedRadio = findViewById<RadioButton>(id)
            if(id == R.id.rdoPublic) {
                selectedRadio.setTextColor(Color.RED)
                binding.rdoRestricted.setTextColor(Color.BLACK)
                access = "Public"
            }
            else if(id == R.id.rdoRestricted) {
                selectedRadio.setTextColor(Color.RED)
                binding.rdoPublic.setTextColor(Color.BLACK)
                access = "Restricted"
            }
        }
        binding.btnNextCreateCerbung2.setOnClickListener{
            val intent = Intent(it.context,CreateCerbung3Activity::class.java).apply {
                putExtra("title", title)
                putExtra("desc", desc)
                putExtra("url", url)
                putExtra("genre", genre)
                putExtra("access", access)
                putExtra("paragraf", paragraf)
            }
            it.context.startActivity(intent)
        }
    }
}