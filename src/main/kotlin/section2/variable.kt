fun main() {
    var number1 = 10L   // 변경 가능
    val number2 = 10L   // 변경 불가능 final


    // 변수만 선언 -> 기본적으로 코틀린은 null을 허용하지 않는다. 따라서 변수 타입 뒤에 ? 를 붙혀줘야 null 가능
    var number4: Long? = 10
    number4 = null

}