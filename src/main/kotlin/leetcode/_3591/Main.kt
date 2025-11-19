package leetcode._3591

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.checkPrimeFrequency(nums)

    if (output) {
        println("There is at least one element which has prime frequency")
    } else {
        println("There is no element with prime frequency")
    }
}