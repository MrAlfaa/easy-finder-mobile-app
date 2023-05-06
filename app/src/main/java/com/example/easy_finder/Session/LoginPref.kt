//package com.example.easy_finder.Session
//
//import android.content.Intent
//import android.content.SharedPreferences
//import com.google.firebase.database.core.Context
//
//class LoginPref {
//
//    lateinit var pref:SharedPreferences
//    lateinit var editor:SharedPreferences.Editor
//    lateinit var con:Context
//    var PRIVATEMODE:Int=0
//
//    constructor(con:Context){
//        this.con=con
//        pref=con.getSharedPreferences(PREF_NAME,PRIVATEMODE)
//        editor=pref.edit()
//    }
//
//    companion object{
//        val PREF_NAME="Login_Preference"
//        val IS_LOGIN="isLoggedin"
//        val KEY_PASSWORD="passsword"
//        val KEY_EMAIL="email"
//    }
//
//    fun createLoginSession(email:String,password:String){
//      editor.putBoolean(IS_LOGIN,true)
//        editor.putString(KEY_PASSWORD,password)
//        editor.putString(KEY_EMAIL,email)
//        editor.commit()
//    }
//
//    fun checkLogin(){
//        if (!this.isLoggedIn()){
//            var i:Intent = Intent(con, LoginActivity::class.java)
//            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
//            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//            con.startActivity(i)
//        }
//    }
//
//    fun getUserDetails():HashMap<String,String>{
//        var user:Map<String,String> = HashMap<String, String>()
//        (user as HashMap).put(KEY_PASSWORD,pref.getString(KEY_PASSWORD, null)!!)
//        (user as HashMap).put(KEY_EMAIL,pref.getString(KEY_EMAIL,null)!!)
//        return user
//    }
//
//    fun LogoutUser(){
//        editor.clear()
//        editor.commit()
//        var i : Intent= Intent(con,LoginActivity::class.java)
//        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        con.startActivity(i)
//    }
//
//    fun isLoggedIn():Boolean{
//        return pref.getBoolean(IS_LOGIN,false)
//    }
//}