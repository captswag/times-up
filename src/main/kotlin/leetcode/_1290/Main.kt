package leetcode._1290

import utils.LinkedListUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val head = LinkedListUtils.createFromIntArray(nums)

    val solution = Solution()
    val output = solution.getDecimalValue(head)

    println("The binary number in the LinkedList is: $output")
}