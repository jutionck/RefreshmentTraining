package com.enigmacamp.pertemuanpertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CounterInterface {

    private lateinit var counterFragment: CounterFragment
    private lateinit var counterShowFragment: CounterShowFragment
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterFragment = fragment1 as CounterFragment
        counterShowFragment = fragment2 as CounterShowFragment
        println("MAIN_ACTIVITY this = $this")
    }

    fun toSecondActivity(view: View) {
        startActivity(Intent(this,SecondActivity::class.java))
    }

    override fun notifyIncrease() {
        counter+=1
        println("Counter $counter")
        counterShowFragment.notifyShowCounter(counter)
    }


    override fun notifyDecrease() {
        counter-=1
        println("Counter $counter")
        counterShowFragment.notifyShowCounter(counter)
    }


}