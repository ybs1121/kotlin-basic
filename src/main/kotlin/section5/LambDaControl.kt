package com.study.section5

fun main(args: Array<String>) {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0]) // 람다 호출 1
    isApple.invoke(fruits[0])  // 람다 호출 1

    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    filterFruits(fruits) { it.name == "사과" }

}


private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val results: MutableList<Fruit> = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results

}
