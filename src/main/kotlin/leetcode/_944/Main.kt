package leetcode._944

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
    val output = solution.minDeletionSize(strs)

    println("The number of columns to be deleted is: $output")
}