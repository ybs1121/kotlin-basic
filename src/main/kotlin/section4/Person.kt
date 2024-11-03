package com.study.section4

//class Person constructor( // constructor 지시어는 생략 가능
//    name: String, age: Int
//) {   // 클래스는 Public 이 기본이다
//    val name = name
//    var age = age
//
//}

class Person(
    val name: String,
    var age: Int // 바로 생성자에서 받아서 생성 -> 필드도 생략 가능, getter를 자동으로 생성해준다
) {
    init { // 초기화 시점에 호출되는 블록
        if (age < 0) {
            throw IllegalArgumentException("age must be >= 0")
        }

        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor() : this("SYSTEM") {
        println("두번째 부생성자")
    } // 최종적으로는 주 생성자를 호출 해야한다
    // 이 생성자는 name을 받는 생성자를 호출하고 그 다음에 주 생성자를 호출

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean // 커스텀 getter
        get() {
            return this.age >= 20
        }

}

fun main() {
    val p = Person("Tester", 10)
    println(p.name) // Getter
    println(p.age)
    p.age = 12 // Setter
}


class Person2(
    name: String
) {
    var name = name
        get() {
            return field.uppercase()
        }
        set(value) {
            field = value.uppercase()
        }
}