package com.tm9704.kotlinbasics

fun main(){
    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
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
    }
}