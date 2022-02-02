package leetcode._1385

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the first IntArray: ")
    val size1 = scanner.nextInt()

    val arr1 = IntArray(size1)
    for (index in arr1.indices) {
        print("Enter the value at index $index: ")
        arr1[index] = scanner.nextInt()
    }

    print("Enter the size of the second IntArray: ")
    val size2 = scanner.nextInt()

    val arr2 = IntArray(size2)
    for (index in arr2.indices) {
        print("Enter the value at index $index: ")
        arr2[index] = scanner.nextInt()
    }

    print("Enter the value of d: ")
    val d = scanner.nextInt()

    val solution = Solution()
    val output = solution.findTheDistanceValue(arr1, arr2, d)

    println("The distance value between the two arrays is: $output")
}