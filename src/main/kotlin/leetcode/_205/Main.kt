package leetcode._205

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the string t: ")
    val t = scanner.next()

    val solution = Solution()
    val output = solution.isIsomorphic(s, t)

    if (output) {
        println("The strings $s and $t are isomorphic")
    } else {
        println("The strings $s and $t are not isomorphic")
    }
}