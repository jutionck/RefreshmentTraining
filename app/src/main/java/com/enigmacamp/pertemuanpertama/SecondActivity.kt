package com.enigmacamp.pertemuanpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(),  View.OnClickListener, CounterInterface {

    private lateinit var counterFragment: CounterFragment
    private lateinit var counterShowFragment: CounterShowFragment
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        counterFragmentButton.setOnClickListener(this)
        counterShowFragmentButton.setOnClickListener(this)
        counterFragment = CounterFragment()
        counterShowFragment = CounterShowFragment()
        //Penempelan fragment secara dinamis, bisa menggunakan FrameLayout dengan id fragmentCointainer
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, counterFragment).commit()
    }

    override fun onClick(v: View?) {
        when(v) {
            counterFragmentButton -> {
                switchFragment(counterFragment)
            }
            counterShowFragmentButton -> {
                counterShowFragment.counter = counter
                switchFragment(counterShowFragment)
            }
        }
    }

    override fun notifyIncrease() {
        counter+=1
    }

    override fun notifyDecrease() {
        counter-=1
    }

    private fun switchFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}