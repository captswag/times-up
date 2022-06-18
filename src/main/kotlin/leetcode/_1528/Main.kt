package leetcode._1528

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val indices = IntArray(size)
    for (index in indices.indices) {
        print("Enter the index value at index $index: ")
        indices[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.restoreString(s, indices)

    println("The string after restoring is: $output")
}