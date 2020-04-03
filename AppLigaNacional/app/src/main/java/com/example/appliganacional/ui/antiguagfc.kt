package com.example.appliganacional

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appliganacional.R
import com.example.appliganacional.databinding.AntiguagfcBinding

class antiguagfc : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_antiguagfc, container, false)

        val binding = AntiguagfcBinding.inflate(inflater)
        var model1 = Model()
        model1.description = " El Antigua Guatemala Fútbol Club, también conocido como Antigua Guatemala o simplemente Antigua GFC, es un equipo de fútbol profesional con sede en La Antigua Guatemala, Guatemala. Juegan sus partidos de local en el Estadio Pensativo. El equipo es apodado como Los Panzas Verdes, en referencia que a los antigüeños se les conoce como aguacateros, debido a que existen abundantes plantas de aguacate, es por esto el uniforme verde, con respeto al uniforme alternativo púrpura o morado se refiere a la tradicional cuaresma y Semana Santa en la que los Cucuruchos visten de este color " +
                " \n (piadosos cargadores de las procesiones se visten de color morado o púrpura con motivo de la pasión de Cristo)."
        binding.model = model1
        return binding.getRoot();

    }
}
