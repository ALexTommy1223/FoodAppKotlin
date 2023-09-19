package com.example.foodorderkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorderkotlin.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private val binding:ActivityRegisterBinding by lazy {
        ActivityRegisterBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.login.setOnClickListener{
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}