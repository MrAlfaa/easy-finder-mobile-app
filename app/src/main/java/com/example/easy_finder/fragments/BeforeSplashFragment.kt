package com.example.easy_finder.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.easy_finder.R
import com.example.easy_finder.databinding.FragmentBeforeSplashBinding
import com.google.firebase.auth.FirebaseAuth

class BeforeSplashFragment : Fragment() {

    private lateinit var navController: NavController
    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding: FragmentBeforeSplashBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBeforeSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)

        binding.iwh.setOnClickListener {
            navController.navigate(R.id.action_beforeSplashFragment_to_signInFragment)
        }

        binding.iww.setOnClickListener {
            navController.navigate(R.id.action_beforeSplashFragment_to_signInFragment)
        }

    }

    private fun init(view: View) {
        navController = Navigation.findNavController(view)
        mAuth = FirebaseAuth.getInstance()

    }


}