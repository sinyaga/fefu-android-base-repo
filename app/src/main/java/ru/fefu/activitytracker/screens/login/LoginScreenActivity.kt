package ru.fefu.activitytracker.screens.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.fefu.activitytracker.databinding.ActivityLoginScreenBinding
import ru.fefu.activitytracker.screens.main.MainScreenActivity

class LoginScreenActivity: AppCompatActivity() {
    private lateinit var binding: ActivityLoginScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setOnClickListener {
            finish()
        }
        binding.loginAceptButton.setOnClickListener{
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
        }
    }
}
