package com.total.video.player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.total.video.player.R
import com.total.video.player.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGreet.setOnClickListener{
            binding.tvGreeting.text = getString(R.string.hello_android)
        }
    }
}
