package ru.fefu.activitytracker.screens.registration

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.ActivityRegistrationScreenBinding
import ru.fefu.activitytracker.screens.login.LoginScreenActivity

class RegistrationScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setOnClickListener {
            finish()
        }
        binding.registrationAcceptButton.setOnClickListener {
            val intent = Intent(this, LoginScreenActivity::class.java)
            startActivity(intent)
        }

    }


}