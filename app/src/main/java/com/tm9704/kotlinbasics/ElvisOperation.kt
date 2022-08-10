package com.tm9704.kotlinbasics

fun main(){
    //var name: String = "Denis"
    var nullableName : String? = "Denis"

    // ?: Elvis operator
    val name = nullableName ?: "Guest"
    println("name is $name")

    println(nullableName!!.toLowerCase())

    //val wifesAge: String? = user?.wife?.age ?: 0
}