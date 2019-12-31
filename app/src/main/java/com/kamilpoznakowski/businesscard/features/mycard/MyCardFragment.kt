package com.kamilpoznakowski.businesscard.features.mycard


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.kamilpoznakowski.businesscard.R
import com.kamilpoznakowski.businesscard.features.createcard.CreateCardFragment
import kotlinx.android.synthetic.main.fragment_my_card.*
import kotlinx.android.synthetic.main.fragment_my_card.view.*

/**
 * A simple [Fragment] subclass.
 */
class MyCardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_my_card, container, false)
//        view.imageButton?.setOnClickListener {
////            findNavController().navigate(R.id.nav_create_card_fragment, null)
//            findNavController().navigate(R.id.action_nav_two_to_createCardFragment, null)
//        }

//        val action = CreateCardFragmentDirections.

        return view
    }

}
