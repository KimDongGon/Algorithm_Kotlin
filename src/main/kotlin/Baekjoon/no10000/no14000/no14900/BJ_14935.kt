package Baekjoon.no10000.no14000.no14900

fun main() = with(System.`in`.bufferedReader()) {
    var x = readLine()
    val list = mutableListOf<Int>()

    while (true) {
        x = ((x[0] - '0') * x.length).toString()

        if (x.toInt() in list) {
            println("FA")
            return
        }

        list.add(x.toInt())
    }
}