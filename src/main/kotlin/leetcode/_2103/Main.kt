package leetcode._2103

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string rings: ")
    val rings = scanner.next()

    val solution = Solution()
    val output = solution.countPoints(rings)

    println("Number of rods with all 3 colors of rings in them are: $output")
}