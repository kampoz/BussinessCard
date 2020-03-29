package com.kamilpoznakowski.businesscard.features.cards

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kamilpoznakowski.businesscard.repository.CardRepository
import com.kamilpoznakowski.businesscard.viewmodel.CardViewModel

class CardViewModelFactory(
    private val cardsRepository: CardRepository

) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CardViewModel(cardsRepository) as T
    }
}