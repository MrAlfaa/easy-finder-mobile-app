package com.example.easy_finder.fragments

//import com.example.easy_finder.databinding.FragmentWuSignUpBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.easy_finder.R
import com.example.easy_finder.databinding.FragmentWuSignUpBinding
import com.google.firebase.auth.FirebaseAuth


class wu_SignUpFragment : Fragment() {

    private lateinit var navController: NavController
    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding:FragmentWuSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWuSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        init(view)

        binding.wuTextViewSignIn.setOnClickListener {
            navController.navigate(R.id.action_signUpFragment_to_signInFragment)
        }

        binding.wuNextBtn.setOnClickListener {
            val email = binding.wuEmailEt.text.toString()
            val pass = binding.wuPassEt.text.toString()
            val verifyPass = binding.wuVerifyPassEt.text.toString()
            val name=binding.wuName.text.toString()

            if (email.isNotEmpty() && name.isNotEmpty() && pass.isNotEmpty() && verifyPass.isNotEmpty()) {
                if (pass == verifyPass) {

                    registerUser(email, pass,name)



                } else {
                    Toast.makeText(context, "Password is not same", Toast.LENGTH_SHORT).show()
                }
            } else
                Toast.makeText(context, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
        }

    }

    private fun registerUser(email: String, pass: String,name:String) {
        mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
            if (it.isSuccessful)


                navController.navigate(R.id.action_signUpFragment_to_signInFragment)




            else
                Toast.makeText(context, it.exception.toString(), Toast.LENGTH_SHORT).show()



        }
    }

    private fun init(view: View) {
        navController = Navigation.findNavController(view)
        mAuth = FirebaseAuth.getInstance()
    }
}