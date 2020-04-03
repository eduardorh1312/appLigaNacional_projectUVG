package com.example.appliganacional.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appliganacional.R
import com.example.appliganacional.databinding.ECobanFragmentBinding

class Coban : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.e_coban_fragment, container, false)

        val binding = ECobanFragmentBinding.inflate(inflater)
        var model1 = Model()
        model1.description = "Es uno de los clubes tradicionales de Guatemala, el club se convirtió en campeón de liga por primera vez el 6 de junio de 2004, cuando derrotó al CSD Municipal en la final del Torneo Clausura. El club fue relegado de la Liga Mayor, tras perder la permanencia contra el Deportivo Zacapa, en la temporada 2005-06 (el 11 de junio de 2006 en tanda de penales). El 24 de mayo de 2015 logró finalmente su ascenso a Liga Mayor, al derrotar al Deportivo Mictlán en el Estadio Mateo Flores.\n" +
                "\n" + "Fue fundado en 1924 participando durante muchos años en la liga inferior. Fue invitado para " +
                "formar parte del Torneo de Copa en la liga mayor de Guatemala en 1960 porque era buen equipo y tenía estadio propio. " +
                "Eduardo \"Mondongo\" Guzmán fue el primer entrenador de los cobaneros, bajo el nombre de Magisterio de Cobán disputaron únicamente " +
                "3 juegos ya que al en adelante lo hicieron con el nombre de 'Cobán Imperial'; durante el torneo debieron de haber jugado la cantidad de" +
                " 17 juegos, sin embargo Cobán solamente cumplió 13 juegos puesto que el resto ya no modificaba la tabla de posiciones, finalizando en el puesto No.14." +
                "El color que identifica al equipo es negro y el blanco, este último empezó a utilizar en su uniforme poco tiempo después de su fundación ya " +
                "que en sus inicios el uniforme del club era color crema. Su rival histórico es el equipo CSD Municipal, con el que disputa el denominado Clásico" +
                " chapín, siendo este encuentro el de mayor rivalidad y el de mayor importancia en Guatemala.\n" +
                "\n" +
                "El Estadio José Ángel Rossi mejor conocido como el Estadio Verapaz está ubicado en la ciudad de Cobán en el departamento de Alta Verapaz en Guatemala, tiene una capacidad para 15,000 aficionados en sus diferentes áreas distribuidas entre graderíos y faldas de cerros, entre cuyos pinos se ubica la afición.\n" +
                "\n" +
                "Fue la primera edificación destinada para la práctica del deporte en Cobán, fue construida en 1936 contando con un área para la práctica de deportes como el fútbol y actividades de atletismo, además de contar con una pista para la carrera de caballos, una concha acústica para la presentación de actividades culturales (fue demolida)\n"
        binding.model = model1
        return binding.getRoot();
        // Inflate the layout for this fragment
    }
}