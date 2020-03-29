package com.kamilpoznakowski.businesscard.repository

import androidx.lifecycle.LiveData
import com.kamilpoznakowski.businesscard.features.cards.Card

interface CardRepository {

    fun addCard(card: Card)

    fun getCard(): LiveData<Card>

    fun getCards(): LiveData<List<Card>>
}