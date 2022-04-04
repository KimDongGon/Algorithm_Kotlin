package Baekjoon.no10000.no14000.no14900

fun main() = with(System.`in`.bufferedReader()) {
    val nums = readLine().split(" ").map { it.toInt() }

    println(nums[1] * (nums[2] / (2 * nums[0])))
}