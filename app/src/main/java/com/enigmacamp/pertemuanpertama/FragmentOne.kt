package com.enigmacamp.pertemuanpertama

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne : Fragment() {

    private val counterViewModel: CounterViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    //Proses set view
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    //Setelah semua berjalan, logic coding taruh di sini
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        increaseButton.setOnClickListener {
          counterViewModel.increase()
            Log.d("FRAGMENT_ONE", "Increment")
        }
        decreaseButton.setOnClickListener {
           counterViewModel.decrease()
        }
    }
}