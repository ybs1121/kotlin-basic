package com.study.section3

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}

fun main(args: Array<String>) {
    Car("Luis", "Peter", 1)
}