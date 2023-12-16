package com.programmingz.videoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programmingz.videoactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn1.setOnClickListener {
            val url = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
            goToPlayerPage(url)
        }
        binding.btn2.setOnClickListener {
            val url = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"
            goToPlayerPage(url)
        }
        binding.btn3.setOnClickListener {
            val url = "https://github.com/rafaelreis-hotmart/Audio-Sample-files/raw/master/sample.mp3"
            goToPlayerPage(url)
        }


    }
    fun goToPlayerPage(url: String){
        var intent = Intent(this, MediaPlayerActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}