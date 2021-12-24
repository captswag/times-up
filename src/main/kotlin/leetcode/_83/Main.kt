package leetcode._83

import extentions.displayFormatted
import utils.LinkedListUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the LinkedLists: ")
    val size = scanner.nextInt()

    val array = IntArray(size)
    for (index in array.indices) {
        print("Enter the element at index $index: ")
        array[index] = scanner.nextInt()
    }

    val input = LinkedListUtils.createFromIntArray(array)
    val solution = Solution()
    val output = solution.deleteDuplicates(input)

    output?.displayFormatted()
}