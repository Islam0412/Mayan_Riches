package com.mayane.casinoo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mayane.casinoo.databinding.ActivityMainBinding
import com.mayane.casinoo.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()


    }
    private fun onClick() {
        binding.btnGame1.setOnClickListener {
            Intent(this@MenuActivity, Game1Activity::class.java).apply{
                startActivity(this)
            }
        }


        binding.btnGame2.setOnClickListener {
            Intent(this@MenuActivity, Game2Activity::class.java).apply {
                startActivity(this)
            }
        }

        binding.privacy.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(browserIntent)
        }

    }
}
