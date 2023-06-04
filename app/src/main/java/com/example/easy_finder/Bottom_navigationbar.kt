package com.example.easy_finder.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.easy_finder.Home
import com.example.easy_finder.Notification
import com.example.easy_finder.Profile
import com.example.easy_finder.R
import com.example.easy_finder.databinding.ActivityBottomNavigationbarBinding

class bottom_navigationbar : AppCompatActivity() {

    private lateinit var binding:ActivityBottomNavigationbarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBottomNavigationbarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())



        binding.bottomNavigationView.setOnItemSelectedListener{

            when(it.itemId){

                R.id.home ->replaceFragment(Home())
                R.id.schedule ->replaceFragment(HomeFragment())
                R.id.notification ->replaceFragment(Notification())
                R.id.profile ->replaceFragment(Profile())


                else->{


                }

            }

            true

        }

    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()


    }
}