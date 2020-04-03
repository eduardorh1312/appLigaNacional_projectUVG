package com.example.appliganacional.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appliganacional.R
import com.example.appliganacional.databinding.EIztapaFragmentBinding


class Iztapa : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.e_iztapa_fragment, container, false)

        val binding = EIztapaFragmentBinding.inflate(inflater)
        var model1 = Model()
        model1.description = "El Club Deportivo Iztapa es un club de fútbol guatemalteco de Iztapa, Departamento de Escuintla. Actualmente juegan en la Liga Nacional de Fútbol de Guatemala, máxima categoría de su fútbol.\n"
        binding.model = model1
        return binding.getRoot();
        // Inflate the layout for this fragment
    }
}