package com.enigmacamp.pertemuanpertama

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LanguageViewModel: ViewModel() {

    val languageLiveData =  mutableListOf("Java", "Golang")

    fun addLanguage(name: String) {
       languageLiveData.add(name)
    }
}
