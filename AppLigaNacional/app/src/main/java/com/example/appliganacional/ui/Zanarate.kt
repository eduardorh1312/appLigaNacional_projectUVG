package com.example.appliganacional.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appliganacional.R
import com.example.appliganacional.databinding.EZanarateFragmentBinding

class Zanarate {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.e_zanarate_fragment, container, false)

        val binding = EZanarateFragmentBinding.inflate(inflater)
        var model1 = Model()
        model1.description = "Sanarate Fútbol Club1 es un club de fútbol de la ciudad de Sanarate. Fundado en 1958, el 3 de junio de 2017 logró su ascenso de Primera División de Guatemala a la Liga Nacional de Fútbol de Guatemala, máxima categoría en su fútbol. Disputa sus encuentros como equipo local en el Estadio Municipal De Sanarate, su uniforme es camiseta celeste con pantalón negro." + "En la " +
                "historia deportiva de Guatemala el fútbol de Sanarate siempre ha estado presente. Fue así como en el año 1958 se construyó en Sanarate un estadio con las especificaciones y los requisitos reglamentarios para practicar el fútbol profesional. Por esa razón y debido a que Sanarate ya había sido subcampeón nacional en 1934, la Federación Nacional de Fútbol dispuso el ascenso del equipo de Sanarate a la Liga Nacional de Fútbol de Guatemala en calidad de invitado en 1959, pero descendió de la misma en la temporada de 1961-1962.\n" +
                "\n" +
                "En esta primera vez que el equipo ascendió mostró un elevado nivel de competitividad, por ejemplo, cuando Sanarate fue visitado por el equipo Los Rojos de Municipal. El equipo rojo venía con un invicto de 17 partidos sin conocer derrota y fue vencido por Sanarate por un marcador de 4 goles a 3." + "En el año de 1965 el equipo de Sanarate descendió a la categoría inmediata inferior de la Liga Mayor pasando a la Liga Mayor “B”. En esa liga el equipo sanarateco impuso el récord de permanecer durante 25 años desde 1965 hasta 1990.\n" +
                "\n" +
                "Deportivo Sanarate F.C. ascendió a la Primera División de Guatemala en 1990.\n" +
                "\n" +
                "Sanarate ganó su primer campeonato en la Segunda División de Guatemala en el Torneo Clausura 2013, siendo este el único título que ha ganado en toda su historia."
        binding.model = model1
        return binding.getRoot();
        // Inflate the layout for this fragment
    }
}