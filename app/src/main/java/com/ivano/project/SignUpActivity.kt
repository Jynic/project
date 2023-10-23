package com.ivano.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ivano.project.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSignUp.setOnClickListener {
            val username = binding.txtUserSignUp.text.toString()
            val password = binding.txtPassSignUp.text.toString()

            if (validateSignUp(username, password)) {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun validateSignUp(username: String, password: String): Boolean {
        val accounts = Global.accounts

        for (account in accounts) {
            if (account.username == username && account.password == password) {
                return true
            }
        }

        return false
    }
}