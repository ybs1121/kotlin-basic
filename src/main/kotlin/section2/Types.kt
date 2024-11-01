package com.study.section2

import Person

fun main() {
    val number1 = 1
    val number2 = 1L
    val number3 = 3.0f
    val number4 = 3.4

    //Java 에서는 타입간의 변화가 암시적으로 이루어질 수 있다
    // Kotlin 은 명시적으로 이루어져야한다

    val number5 = 4
    val number6: Long = number5.toLong() // 명시적 변환
//    val number7 :Long = number5  // Type mismatch.

    val number8: Int? = 3
    val number9: Long = number8?.toLong() ?: 0
}

fun printAgeIfPerson(obj: Any?) {

    if (obj is Person) {
//        val person = obj as Person // 객체 형변환 Java -> (Person) obj
//        println(person.name)

        println(obj.name) // 형 변환을 안하면 스마트 캐스팅으로 변환해준다 -> if로 형식을 체크했기 때문
    }

    if (obj !is Person) {
        println("Person 아님")
    }

    if (obj is Person) {
        val person = obj as? Person // Null이면 person = null
        println(person?.name)
    }
    /**
     * Any -> 자바의 Object Type이랑 유사
     * Unit -> void와 동일한 역할 -> 조금 더 찾아보기
     * Nothing -> 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
     */
}

fun stringTest() {
    val p = Person("asd")
    val log = "사람의 이림은 ${p.name}"

    val name = "홍길동"
    val log2 = "이름은 $name"

    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
}

fun stringIndex() {
    val str = "1234"
    println(str[1]) // Java => str.charAt(1)
}