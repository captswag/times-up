package leetcode._2339

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val distance = IntArray(26)
    for (index in distance.indices) {
        print("Enter the value at index $index: ")
        distance[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.checkDistances(s, distance)

    if (output) {
        println("$s is a well-spaced string")
    } else {
        println("$s is not a well-spaced string")
    }
}