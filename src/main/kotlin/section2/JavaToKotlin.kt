package section2;

import Person

fun main() {
    val person = Person("홍길동") // 코틀린에서는 객체 생성시 new 키워드 사용 X

    println(startWithA(person.name)) // 자바 코드에서 Null인지 아닌지에 대한 정보가 필요하다
}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}