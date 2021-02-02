package com.enigmacamp.pertemuanpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //Inisialisasi
    private lateinit var counterFragment: FragmentOne
    private lateinit var counterShowFragment: FragmentTwo
    private var counter = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterFragment =  FragmentOne()
        counterShowFragment = FragmentTwo()
    }



}