package com.example.mvvmapp.data.api


import com.example.mvvmapp.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}