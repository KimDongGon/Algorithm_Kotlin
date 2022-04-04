package Baekjoon.no10000.no15000.no15900

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()

    if (N == 0) {
        println("divide by zero")
    } else {
        val nums = readLine().split(" ").map { it.toDouble() }

        if (nums.sum() == 0.0) {
            println("divide by zero")
        } else {
            println(String.format("%.2f", 1.00))
        }
    }
}