package leetcode._3683

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the tasks array: ")
    val size = scanner.nextInt()

    val tasks = Array(size) { IntArray(2) }
    for (index in tasks.indices) {
        print("Enter the start time at index $index: ")
        val startTime = scanner.nextInt()
        print("Enter the time taken to finish the task at index $index: ")
        val taskTime = scanner.nextInt()
        tasks[index] = intArrayOf(startTime, taskTime)
    }

    val solution = Solution()
    val output = solution.earliestTime(tasks)

    println("Earliest time at which at least one task is finished is $output")
}