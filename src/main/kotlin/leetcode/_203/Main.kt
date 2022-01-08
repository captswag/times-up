package leetcode._203

import extentions.displayFormatted
import utils.LinkedListUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the LinkedList: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value in index $index: ")
        nums[index] = scanner.nextInt()
    }

    val head = LinkedListUtils.createFromIntArray(nums)

    print("Enter the value to be removed: ")
    val `val` = scanner.nextInt()

    val solution = Solution()
    val output = solution.removeElements(head, `val`)

    output?.displayFormatted()
}