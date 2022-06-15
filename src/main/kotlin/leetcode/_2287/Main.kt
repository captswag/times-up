package leetcode._2287

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the target string: ")
    val target = scanner.next()

    val solution = Solution()
    val output = solution.rearrangeCharacters(s, target)

    println("We can make at-most $output copies")
}