package com.example.birdcounter.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.birdcounter.BirdCounter
import com.example.birdcounter.R


class BirdCounterViewModel : ViewModel() {


    private val _count = MutableLiveData<Int>()
    private val _color = MutableLiveData<Int>()
    val count: LiveData<Int>
        get() = _count
    val color: LiveData<Int>
        get() = _color


    init
    {
        _count.value = 0
        _color.value = 0
    }


    fun seeRedBird()
    {
        _count.value = (count.value)?.plus(1)
        _color.value = R.color.redBird
    }

    fun seeGreenBird()
    {
        _count.value = (count.value)?.plus(1)
        _color.value = R.color.greenBird
    }

    fun seeBlueBird()
    {
        _count.value = (count.value)?.plus(1)
        _color.value = R.color.blueBird
    }

    fun seePurpleBird()
    {
        _count.value = (count.value)?.plus(1)
        _color.value = R.color.purpleBird
    }
}