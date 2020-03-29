package com.kamilpoznakowski.businesscard.features.cards

import androidx.lifecycle.LiveData

interface CardDao {

    fun addCard(card: Card)

    fun getCard(): LiveData<Card>

    fun getCards(): LiveData<List<Card>>

}