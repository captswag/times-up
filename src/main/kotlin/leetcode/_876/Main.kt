package leetcode._876

import utils.LinkedListUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the LinkedList: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the element at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val head = LinkedListUtils.createFromIntArray(nums)

    val solution = Solution()
    val output = solution.middleNode(head)

    println("The middle of the LinkedList is: ${output?.`val`}")
}