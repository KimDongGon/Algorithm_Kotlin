package Baekjoon.no10000.no14000.no14600

import java.math.BigInteger
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val B1 = nextLine().toBigInteger(2)
    val B2 = nextLine().toBigInteger(2)

    println((B1 * B2).toString(2))
}