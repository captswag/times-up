package leetcode._3803

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.residuePrefixes(s)

    println("The count of residue prefixes in $s is $output")
}