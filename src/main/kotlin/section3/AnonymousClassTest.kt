package com.study.section3

fun main(args: Array<String>) {

    moveSomething(object  : Movable {
        override fun move() {
            println("무브")
        }

        override fun fly() {
            println("플라이")
        }

    }
    )

}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

interface Movable {
    fun move()
    fun fly()
}