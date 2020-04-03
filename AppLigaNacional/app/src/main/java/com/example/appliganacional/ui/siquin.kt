package com.example.appliganacional

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appliganacional.R
import com.example.appliganacional.databinding.SiquinFragmentBinding



class siquin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_siquin, container, false)

        val binding = SiquinFragmentBinding.inflate(inflater)
        var model1 = Model()
        model1.description = "El Club Deportivo Siquinalá1​ es un club de fútbol guatemalteco de Siquinalá, " +
                "\n Departamento de Escuintla. Fue fundado en 2004 y actualmente juega en la Liga Nacional de Fútbol de Guatemala, máxima categoría de su fútbol."
        binding.model = model1
        return binding.getRoot();
}
