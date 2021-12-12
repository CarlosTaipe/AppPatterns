package com.cdta.appcreativepattern.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.cdta.appcreativepattern.databinding.ActivityMainBinding
import com.cdta.appcreativepattern.view.adapter.PersonAdapter
import com.cdta.appcreativepattern.viewmodel.PersonViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var personViewModel: PersonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        personViewModel = ViewModelProvider(this)
            .get(PersonViewModel::class.java)

//        personViewModel = ViewModelProvider(this)
//            .get(PersonViewModel::class.java)

        binding.dataContainer.layoutManager = GridLayoutManager(applicationContext, 2)
        personViewModel.personList().observe(this, Observer {
          binding.dataContainer.adapter = PersonAdapter(it)
        })
    }
}