package leetcode._1669

import extentions.displayFormatted
import utils.LinkedListUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of list 1: ")
    val size1 = scanner.nextInt()

    val list1Array = IntArray(size1)
    for (index in list1Array.indices) {
        print("Enter the value at index $index: ")
        list1Array[index] = scanner.nextInt()
    }

    print("Enter the size of list 2: ")
    val size2 = scanner.nextInt()

    val list2Array = IntArray(size2)
    for (index in list2Array.indices) {
        print("Enter the value at index $index: ")
        list2Array[index] = scanner.nextInt()
    }

    val list1 = LinkedListUtils.createFromIntArray(list1Array)
    val list2 = LinkedListUtils.createFromIntArray(list2Array)

    print("Enter the value of a: ")
    val a = scanner.nextInt()

    print("Enter the value of b: ")
    val b = scanner.nextInt()

    val solution = Solution()
    val output = solution.mergeInBetween(list1, a, b, list2)

    output?.displayFormatted()
}