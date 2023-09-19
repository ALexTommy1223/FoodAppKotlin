package com.example.foodorderkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorderkotlin.databinding.ActivityLoginBinding
import com.example.foodorderkotlin.databinding.ActivityStartBinding

class LoginActivity : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.buttonLogin.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.donthaveaccount.setOnClickListener{
            val intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}