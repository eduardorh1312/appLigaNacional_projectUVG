package com.example.appliganacional

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
<<<<<<< HEAD
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_clasificacion.*
import kotlinx.android.synthetic.main.fragment_comprar__boletos.*
=======
import kotlinx.android.synthetic.main.fragment_clasificacion.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
>>>>>>> af855ac270211753ba8d1c080dcc5e6c8b9ecc99

/**
 * A simple [Fragment] subclass.
 */
class Clasificacion : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_clasificacion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
<<<<<<< HEAD
        buttonregreso.setOnClickListener {
            findNavController().navigate(R.id.nav_home)
        }
=======
        button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_clasificacion_to_nav_home))
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Clasificacion.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Clasificacion().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
>>>>>>> af855ac270211753ba8d1c080dcc5e6c8b9ecc99
    }

}
