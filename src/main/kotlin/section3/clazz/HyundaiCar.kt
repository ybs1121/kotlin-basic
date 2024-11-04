package com.study.section3.clazz

sealed class HyundaiCar(
    val name: String,
    val price: Long,
) {

    data class aCar(var memo: String) : HyundaiCar("Acar", 100000L)
}

fun main(args: Array<String>) {
    val a = HyundaiCar.aCar("123")

    println(a.name)
    println(a.price)
    a.memo = "123"
}