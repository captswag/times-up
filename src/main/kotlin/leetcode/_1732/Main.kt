package leetcode._1732

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val gain = IntArray(size)
    for (index in gain.indices) {
        print("Enter the value at index $index: ")
        gain[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.largestAltitude(gain)

    println("The highest altitude is: $output")
}