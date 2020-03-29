package com.kamilpoznakowski.businesscard.viewmodel

import androidx.lifecycle.ViewModel
import com.kamilpoznakowski.businesscard.repository.CardRepository

class CardViewModel(
    private val cardRepository: CardRepository) : ViewModel() {

}