package com.enigmacamp.pertemuanpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    private lateinit var textInputName: TextInputEditText
    private lateinit var tvName: MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textInputName = findViewById(R.id.text_input_name)
        tvName = findViewById(R.id.tv_name)
    }

    fun showName(view: View) {
        val name = textInputName.text //Jution Candra Kirana
        tvName.text = name
    }
}