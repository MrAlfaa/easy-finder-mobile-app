//package com.example.easy_finder
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.appcompat.app.ActionBarDrawerToggle
//import androidx.drawerlayout.widget.DrawerLayout
//import com.google.android.material.navigation.NavigationView
//
//class NavDrawer : AppCompatActivity() {
//
//    lateinit var toogle:ActionBarDrawerToggle
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_nav_drawer)
//
//        val drawerLayout:DrawerLayout=findViewById(R.id.drawerLayout)
//        val navView:NavigationView=findViewById(R.id.nav_drawerview)
//
//        toogle= ActionBarDrawerToggle(activity:this,drawerLayout,R.string.open,R.string)
//
//    }
//}