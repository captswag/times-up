package leetcode._492

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the area: ")
    val area = scanner.nextInt()

    val solution = Solution()
    val output = solution.constructRectangle(area)

    output.displayFormatted()
}