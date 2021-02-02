package com.enigmacamp.pertemuanpertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var userTextInput: TextInputEditText
    private val activityName = "MAIN ACTIVITY"

    companion object {
        const val USER_NAME = "USER_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userTextInput = findViewById(R.id.username_text_input)
    }

    fun moveToSecondActivity(view: View) {
        val intent = Intent(this, BoardActivity::class.java)
        intent.putExtra(USER_NAME, userTextInput.text.toString())
        startActivity(intent)
    }
    // Siklus activity
    override fun onStart() {
        super.onStart()
        Log.i(activityName, "OnStart() CALLED")
    }
    override fun onResume() {
        super.onResume()
        Log.i(activityName, "OnResume() CALLED")
    }
    override fun onPause() {
        super.onPause()
        Log.i(activityName, "OnPause() CALLED")
    }
    override fun onStop() {
        super.onStop()
        Log.i(activityName, "OnStop() CALLED")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(activityName, "OnDestroy() CALLED")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(activityName, "OnRestart() CALLED")
    }
}