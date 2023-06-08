package leetcode._2367

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

    print("Enter the value of diff: ")
    val diff = scanner.nextInt()

    val solution = Solution()
    val output = solution.arithmeticTriplets(nums, diff)

    println("There are $output arithmetic triples")
}