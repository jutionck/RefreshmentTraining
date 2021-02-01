package com.enigmacamp.pertemuanpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class BoardActivity : AppCompatActivity() {

    private lateinit var nameTextView: TextView
    private val boardActivity = "BOARD ACTIVITY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)

        nameTextView = findViewById(R.id.name_text_view)
        val name = intent.getStringExtra(MainActivity.USER_NAME)
        nameTextView.text = name
    }

    override fun onStart() {
        super.onStart()
        Log.i(boardActivity, "OnStart() CALLED")
    }

    override fun onResume() {
        super.onResume()
        Log.i(boardActivity, "OnResume() CALLED")
    }

    override fun onPause() {
        super.onPause()
        Log.i(boardActivity, "OnPause() CALLED")
    }

    override fun onStop() {
        super.onStop()
        Log.i(boardActivity, "OnStop() CALLED")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(boardActivity, "OnDestroy() CALLED")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(boardActivity, "OnRestart() CALLED")
    }
}