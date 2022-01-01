package leetcode._234

import utils.LinkedListUtils
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

    val head = LinkedListUtils.createFromIntArray(nums)

    val solution = Solution()
    val output = solution.isPalindrome(head)

    if (output) {
        println("The given LinkedList is a palindrome")
    } else {
        println("The given LinkedList is not a palindrome")
    }
}