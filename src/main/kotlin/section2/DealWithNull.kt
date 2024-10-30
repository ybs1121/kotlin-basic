package com.study.section2

fun main() {
    val str: String? = "abc"
//    str.length  불가능 null 일 수 있기 때문에
    println(str?.length) //safe call -> str이 null이면 그냥 null을 반환
    val str2: String? = null
    println(str2?.length ?: 0) // Elvis 연산자 : ?:  -> null 이면 뒤의 값을 사용한다
}

fun startsWithA1(str: String?): Boolean { // null 허용

    return str?.startsWith("A")
        ?: throw IllegalArgumentException("str cannot be null")

//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? { // 입력값 null 허용 리턴도 null 허용
    return str?.startsWith("A")
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean { // 입력값 null 허용

    return str?.startsWith("A") ?: false

//    return str.startsWith("A")  // 바로 리턴 못한다. null 일 수 있기 때문에
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
}

fun startsWithA4(str: String?): Boolean { // 입력값 null 허용

    return str!!.startsWith("A") // !! -> 이 값는 NULL이 절대 아니라는 표시
}