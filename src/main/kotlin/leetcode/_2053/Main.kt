package leetcode._2053

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val arr = Array(size) { "" }
    for (index in arr.indices) {
        print("Enter the string at index $index: ")
        arr[index] = scanner.next()
    }

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.kthDistinct(arr, k)

    println("The kth distinct string is: $output")
}