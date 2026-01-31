package leetcode._2399

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val distance = IntArray(size)
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