package com.example.appliganacional

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_comprar__boletos.*


class Comprar_Boletos : Fragment() {

    private val model: SharedViewModel? = null

    fun SenderFragment() {
        // Required empty public constructor
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comprar__boletos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val total_ninos = view!!.findViewById<TextView>(R.id.total_ninos)
        val total_adultos = view!!.findViewById<TextView>(R.id.total_adultos)
        val total = view!!.findViewById<TextView>(R.id.total)
        var t_kids = 0;
        var t_adultos = 0;
        var t_total = 0;

        val model = ViewModelProviders.of(activity!!).get(SharedViewModel::class.java)

        restar_kids.setOnClickListener {
            if(t_kids <= 6 && t_kids > 0){
                t_kids = t_kids - 1
                total_ninos.setText(t_kids)
                t_total = t_total - 12
                total.setText("Total: Q"+ t_total)
            }
        }

        sumar_kids.setOnClickListener {
            if(t_kids < 6 && t_kids >= 0){
                t_kids = t_kids + 1;
                total_ninos.setText(t_kids)
                t_total = t_total + 12
                total.setText("Total: Q"+ t_total)
            }
        }

        restar_adults.setOnClickListener {
            if(t_adultos <= 6 && t_kids > 0){
                t_adultos = t_adultos - 1;
                total_adultos.setText(t_adultos)
                t_total = t_total - 20
                total.setText("Total: Q"+ t_total)
            }
        }

        sumar_adults.setOnClickListener {
            if(t_adultos < 6 && t_kids >= 0){
                t_adultos = t_adultos + 1;
                total_adultos.setText(t_adultos)
                t_total = t_total + 20
                total.setText("Total: Q"+ t_total)
            }
        }

        pagar1.setOnClickListener {
            val msg: String = total.getText().toString()
            model.setMessage(msg)
            Navigation.createNavigateOnClickListener(R.id.action_comprar_Boletos_to_pagoFragment)
        }
    }
}