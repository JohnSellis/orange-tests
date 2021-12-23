package com.orange

import io.lettuce.core.api.StatefulRedisConnection
import io.lettuce.core.api.sync.RedisCommands
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject
import java.awt.SystemColor.text

@Controller
class RestController(
    @Inject val greetings: Collection<Greeting>,
    @Inject val connection: StatefulRedisConnection<String, String>
) {

    @Post("/hello")
    fun hello(): HttpResponse<String> {
        var text  = ""
        greetings.forEach { text += it.javaClass.simpleName + ": " + it.greetings() + "\n" }
        return HttpResponse.ok(text)
    }

    @Get("/redis")
    fun redis(): HttpResponse<Boolean> {
        val commands = connection.sync()
        commands.set("foo", "bar")
        val result = commands.get("foo") == "bar"
        return HttpResponse.ok(result)
    }
}