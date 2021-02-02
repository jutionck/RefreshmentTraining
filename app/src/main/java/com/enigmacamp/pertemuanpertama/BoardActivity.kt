package com.enigmacamp.pertemuanpertama

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.textview.MaterialTextView

class BoardActivity : AppCompatActivity() {

    private lateinit var tvShowName: MaterialTextView
    private val boardActivity = "BOARD ACTIVITY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
        tvShowName = findViewById(R.id.tv_show_name)
        val name = intent.getStringExtra(MainActivity.USER_NAME)
        tvShowName.text = name
    }

    fun implicitIntent(view: View) {
        val implicit = Intent(Intent.ACTION_VIEW, Uri.parse("https://enigmacamp.com"))
        startActivity(implicit)
    }
    // Siklus activity
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