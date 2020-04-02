package com.example.appliganacional.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.appliganacional.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    private lateinit var homeViewModel: HomeViewModel
<<<<<<< HEAD
    private lateinit var auth: FirebaseAuth
=======

>>>>>>> af855ac270211753ba8d1c080dcc5e6c8b9ecc99
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        return inflater.inflate(R.layout.fragment_home, container, false)
<<<<<<< HEAD

=======
>>>>>>> af855ac270211753ba8d1c080dcc5e6c8b9ecc99
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
        })
        return root
    }
<<<<<<< HEAD
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
        buttonRegis.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_registro)
        }
        buttonIngr.setOnClickListener {
            //startActivity(intent(this.fragment_registro::class.java))
            //finish()
        }
    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        updateUI(currentUser)
    }

    fun updateUI(currenteUser: FirebaseUser?){

    }

 */
=======

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonRegis.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_registro)
        }
    }
>>>>>>> af855ac270211753ba8d1c080dcc5e6c8b9ecc99
}
