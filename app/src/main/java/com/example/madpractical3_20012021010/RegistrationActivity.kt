package com.example.madpractical3_20012021010

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012021010.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        WindowCompat.setDecorFitsSystemWindows(window, false)

        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.loginText.setOnClickListener {
            Intent(this, LoginActivity::class.java).also {startActivity(it)}
            binding.loginText.movementMethod =
                LinkMovementMethod.getInstance();

        }

        binding.BottomNavigationView.id = R.id.bottom_nav_reg
        binding.BottomNavigationView.setOnItemSelectedListener { it2 ->
            when(it2.itemId) {
                R.id.bottom_nav_reg -> {
                    Intent(this, RegistrationActivity::class.java).also { startActivity(it) }
                }
                R.id.bottom_nav_login -> {
                    Intent(this, LoginActivity::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}