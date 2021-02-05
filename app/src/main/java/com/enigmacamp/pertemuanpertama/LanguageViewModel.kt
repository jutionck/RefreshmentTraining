package com.enigmacamp.pertemuanpertama

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LanguageViewModel: ViewModel() {

    private val listData = mutableListOf("Java", "Golang")
    val languageLiveData =  MutableLiveData(listData)

    fun addLanguage(name: String) {
        listData.add(name)
        languageLiveData.value = listData
    }

    fun removeLanguage(position: Int) {
        listData.removeAt(position)
        languageLiveData.value = listData
    }
}
