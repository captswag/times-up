package leetcode._2469

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the temperature in celsius: ")
    val celsius = scanner.nextDouble()

    val solution = Solution()
    val output = solution.convertTemperature(celsius)

    output.displayFormatted()
}