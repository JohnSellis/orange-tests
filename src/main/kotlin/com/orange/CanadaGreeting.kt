package com.orange

import jakarta.inject.Singleton

@Singleton
class CanadaGreeting: Greeting {
    override fun greetings(): String {
        return "Canada eH!"
    }
}