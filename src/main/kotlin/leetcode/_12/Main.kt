package leetcode._12

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.intToRoman(num)

    println("The integer to roman value of $num is: $output")
}