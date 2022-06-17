package leetcode._1450

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of time array: ")
    val size = scanner.nextInt()

    val startTime = IntArray(size)
    for (index in startTime.indices) {
        print("Enter the value at index $index: ")
        startTime[index] = scanner.nextInt()
    }

    val endTime = IntArray(size)
    for (index in endTime.indices) {
        print("Enter the value at index $index: ")
        endTime[index] = scanner.nextInt()
    }

    print("Enter the value for query time: ")
    val queryTime = scanner.nextInt()

    val solution = Solution()
    val output = solution.busyStudent(startTime, endTime, queryTime)

    println("We have $output students working during that time period")
}