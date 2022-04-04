package Baekjoon.no10000.no14000.no14400

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var A = nextInt()
    val B = nextInt()
    val C = nextInt()
    val D = nextInt()
    val E = nextInt()

    var answer = 0

    if (A < 0) {
        answer += (0 - A) * C
        A = 0
    }
    if (A == 0) {
        answer += D
    }
    answer += (B - A) * E

    println(answer)
}