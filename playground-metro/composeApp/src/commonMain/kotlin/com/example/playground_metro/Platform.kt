package com.example.playground_metro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform