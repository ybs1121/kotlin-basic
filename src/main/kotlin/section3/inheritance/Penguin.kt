package com.study.section3.inheritance

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {
    // 인터페이스, 추상클래스 둘다 : 로 상속
    private val wingCount: Int = 2


    override fun move() {
        println("팽권이 움직입니다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3

}