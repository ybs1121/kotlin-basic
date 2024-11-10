package com.study.section4


fun main(){
    val str= "ABC"
    val lastChar = str.lastChar()
    println(lastChar)
}

fun String.lastChar(): Char{ // 확장 함수, String을 확장하는 함수
    return this[this.length - 1]
}