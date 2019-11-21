package com.fox.studio.kointest.repository

/*HelloRepository для предоставления некоторых данных:*/

class HelloRepositoryImpl: HelloRepository {
    override fun giveHello() = "Hello koin by Andrey"
}

interface HelloRepository {
    fun giveHello(): String
}