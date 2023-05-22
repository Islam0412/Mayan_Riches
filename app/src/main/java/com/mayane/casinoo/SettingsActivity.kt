package com.mayane.casinoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mayane.casinoo.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick()

    }
    private fun onClick() {
        binding.btnMusic.setOnClickListener {
            Intent(this@SettingsActivity, MenuActivity::class.java).apply {
                startActivity(this)
            }
        }

    }
}