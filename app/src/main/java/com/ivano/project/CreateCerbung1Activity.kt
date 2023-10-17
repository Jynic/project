package com.ivano.project

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import com.ivano.project.databinding.ActivityCardBinding
import com.ivano.project.databinding.ActivityCreateCerbung1Binding
import com.ivano.project.databinding.ActivityHomeBinding

class CreateCerbung1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateCerbung1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCerbung1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapter = ArrayAdapter(this, R.layout.myspinner_layout, Global.genre)
        adapter.setDropDownViewResource(R.layout.myspinner_item_layout)
        binding.spinGenre.adapter = adapter

        binding.btnNextCreateCerbung1.setOnClickListener{
            var title = binding.txtTitle.text.toString();
            var desc = binding.txtDescription.text.toString();
            var url = binding.txtUrl.text.toString();
            val intent = Intent(it.context,Global::class.java).apply {
                putExtra("title", title)
                putExtra("desc", desc)
                putExtra("url", url)
            }
            it.context.startActivity(intent)
        }
    }
}