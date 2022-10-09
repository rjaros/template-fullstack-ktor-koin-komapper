package com.example

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual class PingService(private val dbService: DbService) : IPingService {

    override suspend fun ping(message: String): String {
        println(message)
        dbService.workWithDb()
        return "Hello world from server!"
    }
}
