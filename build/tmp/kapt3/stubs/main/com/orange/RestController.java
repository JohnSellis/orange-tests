package com.orange;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eH\u0007R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/orange/RestController;", "", "greetings", "", "Lcom/orange/Greeting;", "connection", "Lio/lettuce/core/api/StatefulRedisConnection;", "", "(Ljava/util/Collection;Lio/lettuce/core/api/StatefulRedisConnection;)V", "getConnection", "()Lio/lettuce/core/api/StatefulRedisConnection;", "getGreetings", "()Ljava/util/Collection;", "hello", "Lio/micronaut/http/HttpResponse;", "redis", "", "domainservices-back-kotlin-rest-app"})
@io.micronaut.http.annotation.Controller()
public final class RestController {
    @org.jetbrains.annotations.NotNull()
    @jakarta.inject.Inject()
    private final java.util.Collection<com.orange.Greeting> greetings = null;
    @org.jetbrains.annotations.NotNull()
    @jakarta.inject.Inject()
    private final io.lettuce.core.api.StatefulRedisConnection<java.lang.String, java.lang.String> connection = null;
    
    public RestController(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends com.orange.Greeting> greetings, @org.jetbrains.annotations.NotNull()
    io.lettuce.core.api.StatefulRedisConnection<java.lang.String, java.lang.String> connection) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<com.orange.Greeting> getGreetings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.lettuce.core.api.StatefulRedisConnection<java.lang.String, java.lang.String> getConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/hello")
    public final io.micronaut.http.HttpResponse<java.lang.String> hello() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/redis")
    public final io.micronaut.http.HttpResponse<java.lang.Boolean> redis() {
        return null;
    }
}