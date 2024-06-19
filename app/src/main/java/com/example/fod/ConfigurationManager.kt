package com.example.fod


object ConfigurationManager {
    private val config = mutableMapOf(
        "apiEndpoint" to "https://api.fod.com",
        "apiKey" to "ABC123"
    )

    fun getConfig(key: String): String? {
        return config[key]
    }
}
