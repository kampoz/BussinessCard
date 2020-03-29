package com.kamilpoznakowski.businesscard.db

import com.kamilpoznakowski.businesscard.features.cards.CardDao

interface DataBase {
    val cardDao: CardDao
}