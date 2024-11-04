package com.study.section5


fun main(args: Array<String>) {
    val array = arrayOf(10, 20, 30, 40, 50)

    array.plus(60)

    for (i in array.indices) {
        println(array[i])
    }
    println("----------------")
    for (i in array) {
        println(i)
    }

    for ((idx, value) in array.withIndex()) {
        println(array[idx])
        println(value)
    }
}