package com.study.section3.inheritance

class Cat(
    species: String
) : Animal(species, 4) { // : -> extends 코드 컨벤션은 한칸 띄고 쓴다
    // 상위 생성자 클래스를 반드시 호출 해줘야 한다

    override fun move() {
        println("고양이가 걸어갑니다~")
    }


}