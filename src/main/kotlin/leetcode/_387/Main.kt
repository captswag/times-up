package leetcode._387

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.firstUniqChar(s)

    print("The index of the first unique character in the string is: $output")
}