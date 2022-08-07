package com.tm9704.kotlinbasics

fun main(){
    // While loop executes a block of code repeatedly as long as a given condition is true
    var x = 1
    /*while(x<=10){
        println("$x")
        x++
    }
    println("while loop is done")*/
    x = 15
    do{
        println("$x")
        x++
    }while(x <= 10)
    println("do while loop is done")

}