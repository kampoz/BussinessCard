package com.kamilpoznakowski.businesscard.repository

import androidx.lifecycle.LiveData
import com.kamilpoznakowski.businesscard.features.cards.Card

class CardRepositoryImpl : CardRepository {
    override fun addCard(card: Card) {
        TODO("Not yet implemented")
    }

    override fun getCard(): LiveData<Card> {
        TODO("Not yet implemented")
    }

    override fun getCards(): LiveData<List<Card>> {
        TODO("Not yet implemented")
    }
}
