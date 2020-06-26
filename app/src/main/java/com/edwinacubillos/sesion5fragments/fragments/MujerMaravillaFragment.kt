package com.edwinacubillos.sesion5fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.edwinacubillos.sesion5fragments.R
import kotlinx.android.synthetic.main.fragment_mujer_maravilla.*

class MujerMaravillaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mujer_maravilla, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_wonder_woman.setOnClickListener {
            findNavController().navigate(R.id.action_mujerMaravillaFragment_to_SupermanFragment)
        }
    }

}