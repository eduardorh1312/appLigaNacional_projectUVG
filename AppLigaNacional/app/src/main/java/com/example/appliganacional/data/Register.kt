package com.example.appliganacional.data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import com.example.appliganacional.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_ingreso.*
import kotlinx.android.synthetic.main.activity_ingreso.buttonRegis
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        auth = FirebaseAuth.getInstance()

        buttonRegisR.setOnClickListener {
            IngresoUsuario()
        }
    }
     private fun IngresoUsuario(){

        if(tv_usernameR.text.toString().isEmpty()){
            tv_usernameR.error = "Ingrese su correo"
            tv_usernameR.requestFocus()
            return
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(tv_usernameR.text.toString()).matches()){
            tv_usernameR.error = "Ingrese un correo valido"
            tv_usernameR.requestFocus()
            return
        }
        if(tv_passwordR.text.toString().isEmpty()) {
            tv_passwordR.error = "Ingrese su contraseña"
            tv_passwordR.requestFocus()
            return
        }
         auth.createUserWithEmailAndPassword(tv_usernameR.text.toString(), tv_passwordR.text.toString())
             .addOnCompleteListener(this) { task ->
                 if (task.isSuccessful) {
                     startActivity(Intent(this,Ingreso::class.java))
                     finish()
                 } else {
                     Toast.makeText(baseContext, "Sign up failed.",
                         Toast.LENGTH_SHORT).show()
                 }
             }
    }
}
