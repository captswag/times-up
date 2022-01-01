package leetcode._989

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number: ")
    val numString = scanner.next()
    val num = IntArray(numString.length)

    for (index in num.indices) {
        num[index] = Character.getNumericValue(numString[index])
    }

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.addToArrayForm(num, k)

    output.displayFormatted()
}