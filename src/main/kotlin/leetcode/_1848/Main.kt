package leetcode._1848

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

    print("Enter the value of target: ")
    val target = scanner.nextInt()

    print("Enter the value of start: ")
    val start = scanner.nextInt()

    val solution = Solution()
    val output = solution.getMinDistance(nums, target, start)

    println("The minimum distance to the target element is: $output")
}