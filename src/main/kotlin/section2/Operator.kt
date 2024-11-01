package com.study.section2

import JavaMoney


fun main() {

    val money1 = JavaMoney(2_000)

    val money2 = JavaMoney(1_000)
    val money3 = money2
    val money4 = JavaMoney(1_000)

    if (money1 > money2) { // Kotlin 은 자동으로 compareTo를 호출해서 쓸수있다
        println("money1 > money2")
    }

    println(money2 === money3) // 주소값 비고 Java ==  - 동일성
    println(money2 == money4) // equals 값 비교  - 동등성

}