package com.example.appliganacional

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appliganacional.R
import com.example.appliganacional.databinding.DepMixcoBinding

class dep_mixco : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_dep_mixco, container, false)

        val binding = DepMixcoBinding.inflate(inflater)
        var model1 = Model()
        model1.description = " El Deportivo Mixco es un club de fútbol guatemalteco de la ciudad de Mixco, " +
                "\n Departamento de Guatemala. Fue fundado en 1964 y actualmente juega en la Liga Nacional de Fútbol de Guatemala, máxima categoría de su fútbol. En el 2018 se inaugura su nuevo estadio Santo Domingo de Guzmán, antes utilizaban el Estadio Julio Armando Cobar en San Miguel Petapa."
        binding.model = model1
        return binding.getRoot();

    }
}
