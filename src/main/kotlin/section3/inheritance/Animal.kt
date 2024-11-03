package com.study.section3.inheritance

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // open -> override 하기 위한 지시어
) {

    abstract fun move()

}