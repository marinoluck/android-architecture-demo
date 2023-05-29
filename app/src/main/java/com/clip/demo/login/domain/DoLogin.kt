package com.clip.demo.login.domain

import com.clip.demo.login.data.LoginRepository
import javax.inject.Inject

class DoLogin @Inject constructor(private val repository:LoginRepository) {

    suspend operator fun invoke(user:String, password:String):Boolean{
        return repository.doLogin(user, password)
    }
}