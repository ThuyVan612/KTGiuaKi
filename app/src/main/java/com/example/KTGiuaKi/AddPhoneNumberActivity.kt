package com.example.lab2

import activity_add_phone_number.ActivityAddPhoneNumberBindingBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab2.databinding.ActivityAddPhoneNumberBinding
import com.example.lab2.recyclerview.Music

class AddMusicActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddPhoneNumberBinding override override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPhoneNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.save.setOnClickListener {
            val name = binding.edtName.text.toString()
            val singer = binding.edtSinger.text.toString()

            val music = Music(name, singer)

            MainActivity.Musics.add(music)


            finish()
        }
    }
}
