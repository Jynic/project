package com.ivano.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ivano.project.databinding.ActivityCreateCerbung2Binding
import com.ivano.project.databinding.ActivityCreateCerbung3Binding

class CreateCerbung3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateCerbung3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCerbung3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("title")
        val desc = intent.getStringExtra("desc")
        val penulis = "Voldemario"
        val url = intent.getStringExtra("url")
        val para = intent.getStringExtra("para")
        val access = intent.getStringExtra("access")
        val genre = intent.getStringExtra("genre")

        binding.txtViewTitle.setText(title)
        binding.txtViewPara.setText(para)
        binding.textViewDesc.setText(desc)

        var addMovie = Card(3,title.toString(), penulis.toString(), desc.toString(), url.toString(), para.toString(), access.toString(),genre.toString())

        binding.btnPrevCreateCerbung3.setOnClickListener {
            val intent = Intent(it.context,CreateCerbung2Activity::class.java)
            it.context.startActivity(intent)
        }
        binding.btnPublish.setOnClickListener {
            if (binding.checkBoxPolicy.isChecked == true){
                val intent = Intent(it.context,HomeActivity::class.java)
                Global.cards.add(addMovie)
                it.context.startActivity(intent)
            }
            else if (binding.checkBoxPolicy.isChecked == false) {
                Toast.makeText(this, "You haven't agreed to the policy yet", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnHomeCreateCerbung3.setOnClickListener {
            val intent = Intent(it.context,HomeActivity::class.java)
            it.context.startActivity(intent)
        }
    }
}