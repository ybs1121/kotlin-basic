package com.study.section3

fun main(args: Array<String>) {

}


class House(
    private val address: String,
    private val livingRoom: LivingRoom,
    private val room: Room
) {
    class LivingRoom( // static class
        private val area: Double
    )

    inner class Room() {
        val addr: String
            get() {
                return this@House.address
            }
    }
}