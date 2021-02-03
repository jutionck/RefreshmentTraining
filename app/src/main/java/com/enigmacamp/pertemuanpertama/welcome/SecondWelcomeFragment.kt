package com.enigmacamp.pertemuanpertama.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.enigmacamp.pertemuanpertama.R
import kotlinx.android.synthetic.main.fragment_second_welcome.*

class SecondWelcomeFragment : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        secondWelcomeButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            secondWelcomeButton -> navController.navigate(R.id.action_secondWelcomeFragment_to_loginFragment)
        }
    }
}