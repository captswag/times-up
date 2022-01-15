package leetcode._551

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the attendance record: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.checkRecord(s)

    if (output) {
        println("The student is eligible for an attendance award")
    } else {
        println("The student is not eligible for an attendance award")
    }
}