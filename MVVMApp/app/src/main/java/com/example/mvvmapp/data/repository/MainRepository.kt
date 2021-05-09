package com.example.mvvmapp.data.repository

import com.example.mvvmapp.data.api.ApiHelper
import com.example.mvvmapp.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}