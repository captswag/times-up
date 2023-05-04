package leetcode._2496

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val strs = Array(size) { "" }
    for (index in strs.indices) {
        print("Enter the value at index $index: ")
        strs[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.maximumValue(strs)

    println("Maximum value of a string in the given array is: $output")
}