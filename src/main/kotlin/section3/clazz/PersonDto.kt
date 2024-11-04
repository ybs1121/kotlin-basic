package com.study.section3.clazz

data class PersonDto ( // date는 equals, hashcode, toString 을 자동으로 만들어줌
    val name:String,
    val age:Int
){


}

fun main(args: Array<String>) {
    val dto1 = PersonDto( "John", 18)
    val dto2 = PersonDto( "John", 20)
    val dto3 = PersonDto( name = "John", age =  20)

    println(dto1 == dto2)
    println(dto1)
}