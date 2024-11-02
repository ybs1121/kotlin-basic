package com.study.section3

fun parsIntOrThrow(str: String): Int {
    try {
//        return Integer.parseInt(str)
        return str.toInt()
    } catch (e: Exception) {
        throw IllegalArgumentException("주어진 문자열 ${str}은 숫자가 아닙니다.")
    }
}

fun parsIntOrReturnNull(str: String): Int? {
    return try {
//        return Integer.parseInt(str)
        str.toInt()
    } catch (e: Exception) {
        null
    } finally {
        println("종료")
    }
}