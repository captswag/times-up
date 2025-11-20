package leetcode._2960

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val batteryPercentages = IntArray(size)
    for (index in batteryPercentages.indices) {
        print("Enter the value at index $index: ")
        batteryPercentages[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.countTestedDevices(batteryPercentages)

    println("The number of devices that will be tested after performing the test operations in order is $output")
}