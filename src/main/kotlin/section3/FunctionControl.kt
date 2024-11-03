package com.study.section3

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        return a
    } else {
        return b
    }

}

fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

fun max3(a: Int, b: Int) = if (a > b) a else b


// default parameter
fun main () {
    repeat("Hello")
    repeat("Hello", useNewLine = false) //  named parameter -> Kotlin 에서 Java 함수 가져다 쓸 때는 가져다 쓸 수 없다


    printAll("A","B","C")

    val array = arrayOf("A","B","C")
    printAll(*array) // 스프레드 연산자 마치 , 를 쓰는 것처럼 넣어준다.

}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {

    for (i in 0..num) {
        if (useNewLine) {
            println("${str}")
        } else {
            print("$str")
        }
    }
}



fun printAll(vararg strs: String) { // 가변인자 받기 자바의 String...
    for (str in strs) {
        println(str)
    }
}