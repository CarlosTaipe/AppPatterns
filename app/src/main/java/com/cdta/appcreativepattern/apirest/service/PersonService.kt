package com.cdta.appcreativepattern.apirest.service

import com.cdta.appcreativepattern.apirest.response.PersonResult
import retrofit2.Call
import retrofit2.http.GET

interface PersonService {

    @GET("character")
    fun personList(): Call<PersonResult>
}