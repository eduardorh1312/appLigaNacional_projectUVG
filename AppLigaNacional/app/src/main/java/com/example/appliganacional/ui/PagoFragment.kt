package com.example.appliganacional.ui.home

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.appliganacional.R
import kotlinx.android.synthetic.main.fragment_pago.*


class PagoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pago, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val correo = view!!.findViewById<TextView>(R.id.email_s)

        pagar_final.setOnClickListener {
            sendMail()
        }
    }

    fun sendMail() {
        val correo = view!!.findViewById<TextView>(R.id.email_s)
        var recipient = correo.getText().toString()
        var recipientsList = arrayListOf<String>()
        recipientsList.add(recipient)
        var intent = Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_EMAIL, recipientsList)
        //intent.putExtra(Intent.EXTRA_TEXT, message)
        intent.setType("message/rfc822")
        startActivity(Intent.createChooser(intent, "Choose an email client"))
    }
}