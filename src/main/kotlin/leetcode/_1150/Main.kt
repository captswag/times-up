package leetcode._1150

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        nums[index] = scanner.nextInt()
    }

    print("Enter the target: ")
    val target = scanner.nextInt()

    val solution = Solution()
    val output = solution.isMajorityElement(nums, target)

    if (output) {
        println("$target is the majority element")
    } else {
        println("$target is not the majority element")
    }
}