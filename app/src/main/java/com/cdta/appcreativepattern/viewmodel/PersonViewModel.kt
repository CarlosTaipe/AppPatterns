package com.cdta.appcreativepattern.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.cdta.appcreativepattern.apirest.response.Result
import com.cdta.appcreativepattern.repository.PersonRepository

class PersonViewModel: ViewModel() {

    private var repository = PersonRepository()

    fun personList(): LiveData<List<Result>>{
        return repository.personList()
    }

}