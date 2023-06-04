package com.example.easy_finder.TestUtil

object RegistrationUtil {

    //private val existingUsers=listof("Peter@gmail.com")
    /**
     * the input is not valid if....
     * the username/password is empty
     * the confirmed password is not the same as the real password*/

    fun validateRegistrationInput(
        email:String,
        password:String,
        confirmedPassword:String
    ):Boolean{
        if (email.isEmpty() || password.isEmpty()){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        if (password.count{it.isDigit()}<2){
            return false
        }
        return true
    }
}