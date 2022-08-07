package com.tm9704.kotlinbasics

fun main(){
    // Arithmetic opertors (+, -, *, /, %)
    var result = 5+3
    result /= 2
    result *= 2
    result += 2
    result -= 2
    result = 15 % 2

    val a = 5.0
    val b = 3.0
    var resultDouble : Double
    resultDouble = a / b
//    print(resultDouble)

    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    //println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    //println("isEqual is $isNotEqual")
    //String interpolation $
    //println("is5greater3 ${5>3}")
    //println("is5LowerEqual3 ${5 <= 3}")
    //println("is5GreaterEqual3 ${5>=3}")

    // Assignment operators(+=, -=, *=, /=., %=)
    var myNum = 5
    myNum += 3
   // println("myNum is ${myNum}")

    // Increment & Decrement operators(++,--)
    myNum++
    println("myNum is ${myNum}")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
}