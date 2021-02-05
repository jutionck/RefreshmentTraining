package com.enigmacamp.pertemuanpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecycleClickListener {

    private val languageViewModel by viewModels<LanguageViewModel>()
    private lateinit var languageRecyclerAdapter: LanguageRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        language_recycle_view.layoutManager = LinearLayoutManager(this)
        languageRecyclerAdapter =
            LanguageRecyclerAdapter(languageViewModel.languageLiveData.value!!)
        language_recycle_view.adapter = languageRecyclerAdapter
        languageViewModel.languageLiveData.observe(this, Observer {
            languageRecyclerAdapter.notifyDataSetChanged()
        })
    }

    fun addLanguage(view: View) {
        val languageName = language_name_input.text.toString()
        languageViewModel.addLanguage(languageName)
    }

    override fun onItemCLick(view: View, position: Int) {
        languageViewModel.removeLanguage(position)
        Toast.makeText(this, "$position Deleted!", Toast.LENGTH_SHORT).show()
    }


}
