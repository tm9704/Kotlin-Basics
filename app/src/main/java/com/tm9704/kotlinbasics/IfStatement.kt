package com.tm9704.kotlinbasics

fun main(){
    var heightPerson1 = 170
    var heightPerson2 = 189

   /* if(heightPerson1 > heightPerson2){
        println("use raw force")
    }else if(heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    }else{
        println("use technique")
    }

    val age = 15

    if(age >= 21){
        println("now you may drink in the US")
    }else if(age >= 18){
        println("you may vote now")
    }else if(age >= 16){
        println("you may drive now")
    }else{
        print("you're too young")
    }

    var name = "Denis"

    if(name == "Dennis"){
        println("welcome home Dennis")
    }else{
        println("Who are you?")
    }

    var isRainy = true
    if(isRainy) {
        println("It's rainy")
    } */

    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var age = 20
    when(age){
        !in 0..20 -> println("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        16,17 -> println("you may drive now")
        else -> println("you're too young")
    }

    var x : Any = 13.37f
    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}