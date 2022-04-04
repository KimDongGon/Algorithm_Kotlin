package Baekjoon.no10000.no15000.no15000

fun main() = with(System.`in`.bufferedReader()) {
    val arr1 = readLine().split(" ").map { it.toInt() }
    val arr2 = readLine().split(" ").map { it.toInt() }

    var answer = 0

    for ((i, j) in arr1 zip arr2) {
        answer += if (j > i) j - i else 0
    }

    println(answer)
}