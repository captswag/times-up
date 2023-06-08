package leetcode._2432

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val logs = Array(size) { IntArray(2) }
    for (index in logs.indices) {
        println("Index: $index")
        print("Enter the id: ")
        logs[index][0] = scanner.nextInt()
        print("Enter the value of leaveTime: ")
        logs[index][1] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.hardestWorker(n, logs)

    println("The id of the employee that worked the task with the longest time is: $output")
}