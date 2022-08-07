package com.tm9704.kotlinbasics

fun main(){
    // mutable variable
    var myName = "Denis"
    myName = "Heidi"
    print("Hello " + myName)

    // immutable varialbe
    // TODO: Add new functionality
    //type: string
    val myName2 = "Frank"
    // myName2 = "Min" //error

    // number variable type : int 32bit
    var myAge = 31

    // Integer TYPES: Byte(8bit), Short(16bit),
    // Int(32bit), Long(64bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_394

    // Floating Point number Types: Float(32bit), Double(64bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "HelloWorld"
    var firstCharInStr = myStr[0] // 문자열 첫번째 문자에 접근
    var lastCharInStr = myStr[myStr.length - 1]

    // Practice
    var className: String = "Android Masterclass"
    val floatEx: Float = 13.37F
    val doublePi: Double = 3.14159265358979
    var byteEx: Byte = 25
    var intEx: Int = 2020
    var longEx: Long = 18881234567
    var boolEx: Boolean = true
    var chrEx: Char = 'a'
}

