package com.orange

import jakarta.inject.Singleton

@Singleton
class SpainGreeting: Greeting {
    override fun greetings(): String {
        return "Ola, que tal?"
    }
}