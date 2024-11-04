package com.study.section5

fun main(args: Array<String>) {
    val numbers = listOf(10, 20) // 불변
    val empty = emptyList<Int>()
    val empty2 = mutableListOf<Int>()

    val numbers2 = mutableListOf(10, 20) // 가변 리스트

    numbers.get(0)
    numbers[0]

    for (n in numbers) {
        println(n)
    }

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "1")
    oldMap[2] = "2"

    mapOf(1 to "1~", 2 to "2~", 3 to "3~")

    for(key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for((k,v) in oldMap.entries){
        println(v)
        println(k)
    }
}