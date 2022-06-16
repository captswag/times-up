package leetcode._2206

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.divideArray(nums)

    if (output) {
        println("The given numbers can be divided into equal pairs")
    } else {
        println("The given numbers cannot be divided into equal pairs")
    }
}