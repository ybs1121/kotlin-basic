package com.study.section3

class Person(
    var name: String,
    var age: Int,
) {
    companion object Factory : Log { // static 처럼 사용할 변수, 함수를 블록에 넣어준다
        private const val MIN_AGE = 1 // const -> String, 기본 타입에만 붙힐 수 있다 진짜 상수
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("상속된 내용을 구현했어요~")
        }

    }
}

fun main(args: Array<String>) {
    Person.newBaby("ABC")
    Singleton.a
    Singleton.a += 10
}

object Singleton {
    var a: Int = 0
}