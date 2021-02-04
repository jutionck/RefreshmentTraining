package com.enigmacamp.pertemuanpertama

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    var counter = MutableLiveData(0)
    var cnt = 0

    fun increase() {
        cnt++
        counter.value = cnt
    }

    fun decrease() {
        cnt--
        counter.value = cnt
    }
}