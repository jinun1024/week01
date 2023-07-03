package com.example.week01

import kotlin.math.max
import kotlin.random.Random

const val num=20

fun main() {
    print("Hello word\n")
    var i  = 10
    var l  = 10L
    var name : String="진헌"
    var point : Double =3.3

    print("제 이름은 $name 입니다\n")


    // 상수와 변수의 차이는 변수는 재대입 가능 상수는 재대입이 불가능함




    var a =10
    var b= 20
    print (max(a,b))

    val randomNumber = Random.nextInt(0,100)
    print(randomNumber)



}