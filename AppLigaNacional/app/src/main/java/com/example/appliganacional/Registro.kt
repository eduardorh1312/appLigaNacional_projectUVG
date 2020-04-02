package com.example.appliganacional

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_home.*


/**
 * A simple [Fragment] subclass.
 */
class Registro : Fragment() {
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registro, container, false)

    }
    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
        buttonRegis.setOnClickListener {
            Ingreso()
        }
    }

    private fun Ingreso(){
        if(tv_username.text.toString().isEmpty()){
            tv_username.error = "Ingrese su correo"
            tv_username.requestFocus()
            return
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(tv_username.text.toString()).matches()){
            tv_username.error = "Ingrese un correo valido"
            tv_username.requestFocus()
            return
        }
        if(tv_password.text.toString().isEmpty()){
            tv_username.error = "Ingrese su correro"
            tv_username.requestFocus()
            return
        }

        //auth.createUserWithEmailAndPassword(tv_username.text.toString(), tv_password.text.toString())
         //   .addOnCompleteListener(this) { task ->
             //   if (task.isSuccessful) {
                    //startActivity(intent(this.fragment_home::class.java))
                    //finish()
              //  } else {
                    //Toast.makeText(baseContext, "Sign up failed.",
                       // Toast.LENGTH_SHORT).show()
               // }

                // ...
          //  }
    }

*/
}
