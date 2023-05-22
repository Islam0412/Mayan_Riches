package com.mayane.casinoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mayane.casinoo.databinding.ActivityGame2Binding

class Game2Activity : AppCompatActivity() {
    private lateinit var binding:ActivityGame2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGame2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}