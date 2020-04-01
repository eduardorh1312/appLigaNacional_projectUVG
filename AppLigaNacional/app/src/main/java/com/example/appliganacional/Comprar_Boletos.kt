package com.example.appliganacional

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_comprar__boletos.*
import kotlinx.android.synthetic.main.nav_header_main.*


class Comprar_Boletos : Fragment() {

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
        pagar1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_comprar_Boletos_to_pagoFragment))
    }
}