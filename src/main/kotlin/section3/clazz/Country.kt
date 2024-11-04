package com.study.section3.clazz

enum class Country(
    private val countryCode: String
) {
    KOREA("KO"),
    AMERICA("US"),
    A("A")
    ;
}

fun handCountry(country: Country): String {
    return when (country) { // enum일 경우 else를 안써도 된다.
        Country.KOREA -> return "Korea"
        Country.AMERICA -> return "America"
        Country.A -> TODO()
    }
}

