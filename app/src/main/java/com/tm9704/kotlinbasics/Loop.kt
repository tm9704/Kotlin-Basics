package com.tm9704.kotlinbasics

fun main(){
    // While loop executes a block of code repeatedly as long as a given condition is true
    var x = 12
    /*while(x<=10){
        println("$x")
        x++
    }
    println("while loop is done")
    x = 15
    do{
        println("$x")
        x++
    }while(x <= 10)
    println("do while loop is done")

    //while reivew
    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    //for loop
    for(num in 1..10){
        print("$num")
    }

    println("--------------------------------")

    for(i in 1 until 10){ // Same as - for(i in 1.until(10)
        print("$i ")
    }

    println("--------------------------------")

    for(i in 10 downTo 1 step 2){ // Same as - for(i in 10.downTo(1).step(2)
        print("$i ")
    }*/

    // Loop Practice
    /*for(num in 1..10000){
        if(num == 9001)
            print("IT'S OVER 9000!")
    }

    var humidity = "humid"
    var humidityLevel = 80
    while(humidity == "humid"){
        humidityLevel -= 5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }*/

    //Bonus - 1. break
    /*for(i in 1 until 20){
        print("$i ")
        if(i/2 == 5){
            break
        }
    }*/
    //Bonus - 2. continue
    for(i in 1 until 20){
        if(i/2 == 5){
            continue
        }
        print("$i ")
    }
    print("Done with the loop")
}