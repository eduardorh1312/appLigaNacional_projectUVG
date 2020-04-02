package com.example.appliganacional.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.appliganacional.R
import com.example.appliganacional.SharedViewModel
import kotlinx.android.synthetic.main.fragment_comprar__boletos.*
import kotlinx.android.synthetic.main.fragment_pago.*


class PagoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pago, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pagar_final.setOnClickListener {
            sendMail()
        }
    }

    fun sendMail() {
        val model = ViewModelProviders.of(activity!!).get(SharedViewModel::class.java)
        model.message.observe(this,
            Observer<Any?> { o -> textView8.setText(o.toString()) })
        val msg1: String = "Su " + total.getText().toString()
        val correo = view!!.findViewById<TextView>(R.id.email_s)
        var recipient = correo.getText().toString()
        var recipientsList = arrayListOf<String>()
        recipientsList.add(recipient)
        var intent = Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_EMAIL, recipientsList)
        intent.putExtra(Intent.EXTRA_TEXT, msg1)
        intent.setType("message/rfc822")
        startActivity(Intent.createChooser(intent, "Escoga un cliente"))
    }
}