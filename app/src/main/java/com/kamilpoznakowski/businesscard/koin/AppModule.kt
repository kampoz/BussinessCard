package com.kamilpoznakowski.businesscard.koin

import com.kamilpoznakowski.businesscard.repository.CardRepository
import com.kamilpoznakowski.businesscard.repository.CardRepositoryImpl
import org.koin.dsl.module

val appModule = module {

    single { CardRepositoryImpl() }
}