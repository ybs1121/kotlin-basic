package com.study.section5

import java.util.*

fun main(args: Array<String>) {
    val fruits = listOf(
        Fruit2("사과", 1_000, 1_200),
        Fruit2("사과", 1_200, 1_200),
        Fruit2("사과", 1_200, 1_200),
        Fruit2("사과", 1_500, 1_200),
        Fruit2("바나나", 3_000, 1_200),
        Fruit2("바나나", 3_200, 1_200),
        Fruit2("바나나", 2_500, 1_200),
        Fruit2("수박", 10_00, 1_2000)
    )
    filterFruits2(fruits) {fruit: Fruit2 -> fruit.name == "바나나" }
}

private fun filterFruits(
    fruits: List<Fruit2>,
    filter: (Fruit2) -> Boolean
): List<Fruit2> {
    return fruits.filter(filter)
}

private fun filterFruits2(
    fruits: List<Fruit2>,
    filter: (Fruit2) -> Boolean
){
    val toCollection = fruits.filter(filter)
        .map { f -> f.name }.toCollection(LinkedList())
    toCollection.forEach { fruitName -> println(fruitName)}
}

