package com.ivano.project

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.ivano.project.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnLogIn.setOnClickListener {
            val username = binding.txtUserLogIn.text.toString()
            val password = binding.txtPassLogIn.text.toString()

            if (validateLogin(username, password)) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnSignUpLogin.setOnClickListener {
            val intent = Intent(it.context,SignUpActivity::class.java)
            it.context.startActivity(intent)
        }
    }

    private fun validateLogin(username: String, password: String): Boolean {
        val accounts = Global.accounts

        for (account in accounts) {
            if (account.username == username && account.password == password) {
                return true
            }
        }

        return false
    }
}
