package Baekjoon.no10000.no15000.no15700

import java.lang.Double.max

fun main() = with(System.`in`.bufferedReader()) {
    val nums = readLine().split(" ").map { it.toDouble() }

    val a = nums[0] / nums[1] * nums[2]
    val b = nums[0] * nums[1] / nums[2]

    println(max(a, b).toInt())
}