package com.study.section3

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("The score must be greater than 0 -> input ${score}")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
}

fun rangeControl(score: Int) {
    if (score in 1..100) {
        println("1이상 100 이하")
    }

    if (score !in 1..100) {
        println("1미만 100 초과")
    }
}