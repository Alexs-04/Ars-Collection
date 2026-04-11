package com.korebit

fun main() {
    val array : Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(array[0])
    println(array[1])

    array.forEach {
        println(it)
    }
}