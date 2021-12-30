package leetcode._169

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the element at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val solution = Solution()
    val majorityElement = solution.majorityElement(nums)

    println("The majority element in the array is: $majorityElement")
}