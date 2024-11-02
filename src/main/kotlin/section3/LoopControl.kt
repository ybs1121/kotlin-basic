package com.study.section3

fun main() {
    val number = listOf(1L, 2L, 3L)

    for (num in number) {
        println(num)
    }
    println("---------")
    for (i in 1..3) {
        println(i)
    }
    println("---------")
    for (i in 3 downTo 1) { // i--;
        println(i)
    }
    println("---------")
    for (i in 1..5 step 2) {
        println(i)
    }

    println("---------")

    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
}