package com.tm9704.kotlinbasics

fun main(){
    // argument
    var result = avg(5.3,13.37)
    print("result is $result")
}

fun avg(a: Double, b: Double) : Double{
    return (a+b)/2
}

// Method - a Method is a Function within a class
// Parameter (input)
fun addUp(a: Int, b: Int) : Int{
    // output
    return a+b
}

fun myFunction(){
    print("Called from myFunction")
}
