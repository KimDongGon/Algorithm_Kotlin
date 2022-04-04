package Baekjoon.no10000.no15000.no15800

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val AB = sc.next()

    println(when (AB.length) {
        2 -> (AB[0] - '0') + (AB[1] - '0')
        3 -> if ((AB[1] - '0') == 0) (10 + (AB[2] - '0')) else ((AB[0] - '0') + 10)
        4 -> 20
        else -> 0
    })
}