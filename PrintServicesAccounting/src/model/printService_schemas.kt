package model

data class Person(
    val id: Int,
    val client_name: String,
    val service_type: String,
    val pageCount: Int,
    var price: Int,
    var copies: Int
)