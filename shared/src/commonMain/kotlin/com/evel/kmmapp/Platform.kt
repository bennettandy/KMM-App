package com.evel.kmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform