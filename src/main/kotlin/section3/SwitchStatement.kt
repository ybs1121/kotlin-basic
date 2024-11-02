package com.study.section3

fun getGradeSwitch(score: Int): String {
    return when (score / 10) { // Java -> switch Kotlin -> when
        9 -> "A" // case 대신 ->
        8 -> "B"
        7 -> "C"
        6 -> "D"
        5 -> "E"
        else -> "D" // default 대신 else
    }

    // return 을 바로 할 수 있어서 삼항연산자 대신 사용 Kotlin 에서는 삼항연산자 없음
}

fun getGradeSwitch2(score: Int): String {
    return when (score) { // Java -> switch Kotlin -> when
        in 90..100 -> "A" // case 대신 ->
        in 80..85 -> "B"
        in 70..79 -> "C"
        else -> "D" // default 대신 else
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false

    }
}
fun judgeNum(num : Int){
    when (num) {
        1, 0 , -1 -> println("good")
        else -> println("bad")
    }
}

fun judgeNum2(num : Int){
    when {
        num == 0 -> println("good")
        num == 1 -> println("bad")
    }
}