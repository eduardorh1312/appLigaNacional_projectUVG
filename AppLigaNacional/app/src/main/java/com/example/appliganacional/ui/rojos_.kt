package com.example.appliganacional

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appliganacional.R
import com.example.appliganacional.databinding.RojosFragmentBinding



class rojos_ : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_rojos_, container, false)

        val binding = RojosFragmentBinding.inflate(inflater)
        var model1 = Model()
        model1.description = "El Club Social y Deportivo Municipal,1\u200B conocido simplemente como Municipal, es un equipo de fútbol de Guatemala y que actualmente pertenece a la Liga Nacional de Guatemala y disputa sus partidos en el Estadio Manuel Felipe Carrera.\n" +
                "\n" +
                "Fue fundado el 17 de mayo de 1936 en Ciudad de Guatemala, actualmente compite en la Liga Nacional y juega sus partidos de local en el Manuel Felipe Carrera Los colores que identifican al club son el rojo y el azul, utilizados tiempo después de su fundación.\n" +
                "\n" +
                "El Club Social y Deportivo Municipal, entre sus logros ha obtenido los siguientes títulos nacionales: treinta y uno de Liga, ocho de Copa y cinco de Campeón de Campeones y cuenta en su palmarés de títulos internacionales con una Copa de Campeones de la Concacaf 1974 y cuatro títulos del ya desaparecido torneo de clubes centroamericanos UNCAF. Su último título fue en el Apertura 2019, frente a Antigua GFC."
        binding.model = model1
        return binding.getRoot();
    }
