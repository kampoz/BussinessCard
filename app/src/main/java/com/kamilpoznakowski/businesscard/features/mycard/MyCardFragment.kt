package com.kamilpoznakowski.businesscard.features.mycard


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kamilpoznakowski.businesscard.R
import com.kamilpoznakowski.businesscard.features.cards.CardViewModelFactory
import com.kamilpoznakowski.businesscard.repository.CardRepositoryImpl
import com.kamilpoznakowski.businesscard.viewmodel.CardViewModel
import org.koin.android.ext.android.get

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
        val cardViewModelFactory = CardViewModelFactory(get<CardRepositoryImpl>())
        var cardViewModel = ViewModelProvider(this, cardViewModelFactory).get(CardViewModel::class.java)

        return view
    }

}
