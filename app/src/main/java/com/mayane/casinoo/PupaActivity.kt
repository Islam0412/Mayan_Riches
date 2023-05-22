package com.mayane.casinoo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mayane.casinoo.databinding.ActivityMainBinding
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
class PupaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick()
    }

    private fun onClick() {
        binding.btnPlayAs.setOnClickListener {
            Intent(this@PupaActivity, SettingsActivity::class.java).apply {
                startActivity(this)
            }
        }
        binding.btnSingUp.setOnClickListener {
            Intent(this@PupaActivity, AuthActivity::class.java).apply {
                startActivity(this)

            }
        }

    }

}