package com.tm9704.kotlinbasics



fun main(){
    var name: String = "Denis"
    // name = null -> Compilation ERROR
    var nullableName: String? = "Denis"
    //nullableName = null

    var len = name.length
    var len2 = nullableName?.length
    //println(nullableName?.toLowerCase())
    nullableName?.let { println(it.length) }

    //old way
    /*if(nullableName != null){
        var len2 = nullableName.length
    }else{
        null
    }*/

}