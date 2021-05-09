package com.example.birdcounter.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.birdcounter.R
import com.example.birdcounter.data.PreferencesManager
import com.example.birdcounter.databinding.ActivityMainBinding
import com.example.birdcounter.viewmodels.BirdCounterViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: BirdCounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(BirdCounterViewModel::class.java)
        binding.birdCounterViewModel = viewModel

        viewModel.count.observe(this, Observer { newCount -> binding.tvBirdsSeen.text = newCount.toString() })
        viewModel.color.observe(this, Observer { newColor -> binding.tvBirdsSeen.setBackgroundResource(newColor) })


    }



}