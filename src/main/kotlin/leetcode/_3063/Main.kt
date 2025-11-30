package leetcode._3063

import extentions.displayFormatted
import utils.LinkedListUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the LinkedList: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val head = LinkedListUtils.createFromIntArray(nums)

    val solution = Solution()
    val output = solution.frequenciesOfElements(head)

    output?.displayFormatted()
}