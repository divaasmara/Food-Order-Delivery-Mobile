package com.example.fod


import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            get("/") {
                call.respondText("Welcome to the Food Delivery Service", ContentType.Text.Plain)
            }
            get("/config") {
                val apiEndpoint = ConfigurationManager.getConfig("apiEndpoint")
                val apiKey = ConfigurationManager.getConfig("apiKey")
                call.respondText("API Endpoint: $apiEndpoint, API Key: $apiKey", ContentType.Text.Plain)
            }
        }
    }.start(wait = true)
}
