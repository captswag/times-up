package leetcode._2651

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter arrival time: ")
    val arrivalTime = scanner.nextInt()

    print("Enter delayed time: ")
    val delayedTime = scanner.nextInt()

    val solution = Solution()
    val output = solution.findDelayedArrivalTime(arrivalTime, delayedTime)

    println("Delayed arrival time is: $output")
}