package com.example.appliganacional.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.appliganacional.R
import com.example.appliganacional.databinding.ComunicacionesFragmentBinding
import com.example.appliganacional.databinding.ComunicacionesFragmentBinding.inflate

class Comunicaciones : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.comunicaciones_fragment, container, false)

        val binding = ComunicacionesFragmentBinding.inflate(inflater)
        var model1 = Model()
        model1.description = "El Comunicaciones Fútbol Club, Sociedad Anónima, conocido simplemente como Comunicaciones, es un club de fútbol profesional con sede en la Ciudad de Guatemala. Actualmente milita en la Liga Nacional de Guatemala y juega sus partidos de local en el Estadio Doroteo Guamuch Flores.\n" +
                "\n" + "Fue fundado oficialmente bajo el nombre de Club Social y Deportivo Comunicaciones el 16 de agosto de 1949. Actualmente el club cuenta con treinta Ligas, ocho Copas y diez Campeón de Campeones; a nivel internacional tiene en sus vitrinas dos Copas Fraternidad Centroamericana y una Copa de Campeones de la Concacaf." +
                "El color que identifica al equipo es negro y el blanco, este último empezó a utilizar en su uniforme poco tiempo después de su fundación ya que en sus inicios el uniforme del club era color crema. Su rival histórico es el equipo CSD Municipal, con el que disputa el denominado Clásico chapín, siendo este encuentro el de mayor rivalidad y el de mayor importancia en Guatemala.\n" +
                "\n" +
                "Con la obtención de los títulos de liga consecutivos en el Apertura 2012 hasta Clausura 2015, se convirtió en el primer y único club profesional en Guatemala y segundo de Centroamérica en lograr un hexacampeonato.\n" +
                "\n" +
                "En 2009, la FIFA lo catalogó como uno de los clubes «clásicos del mundo», siendo el único equipo guatemalteco con esta distinción que también tienen otros 5 equipos centroamericanos.\n"
        binding.model = model1
        return binding.getRoot();
        // Inflate the layout for this fragment
    }
}