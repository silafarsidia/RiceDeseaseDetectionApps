package com.example.ricedeseasedetectionapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.ricedeseasedetectionapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.navigationBarColor = resources.getColor(R.color.black)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.black)
        }

        supportActionBar?.hide()

        itemOnClickListener()
    }

    private fun itemOnClickListener() {
        binding.btnStartDetection.setOnClickListener {
            startActivity(Intent(this, DetectionActivity::class.java))
        }

        binding.btnInformation.setOnClickListener {
            startActivity(Intent(this, InformationActivity::class.java))
        }

        binding.btnAbout.setOnClickListener {
            startActivity(Intent(this, InformationActivity::class.java))
        }
    }
}