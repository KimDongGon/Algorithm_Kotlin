package Baekjoon.no20000.no24000.no24800

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val alpha = next()

    println(if (alpha.lowercase() == "n") "Naver D2" else "Naver Whale")
}