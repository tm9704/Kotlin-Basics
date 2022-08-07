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
}


