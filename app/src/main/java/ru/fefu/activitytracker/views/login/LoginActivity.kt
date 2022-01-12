package ru.fefu.activitytracker.views.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.fefu.activitytracker.databinding.ActivityLoginScreenBinding
import ru.fefu.activitytracker.views.main.MainActivity

class LoginActivity: AppCompatActivity() {
    private lateinit var _binding: ActivityLoginScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.toolbar.setOnClickListener {
            finish()
        }
        _binding.loginAceptButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}