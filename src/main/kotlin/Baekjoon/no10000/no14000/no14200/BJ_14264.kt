package Baekjoon.no10000.no14000.no14200

import java.util.Scanner
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)) {
    val L = nextDouble()

    println((L / 2) * (L * sqrt(3.0)) * 0.5)
}