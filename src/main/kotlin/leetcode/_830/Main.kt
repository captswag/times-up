package leetcode._830

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.largeGroupPositions(s)

    println("The large groups are: ")
    for (range in output) {
        println("[${range[0]}, ${range[1]}]")
    }
}