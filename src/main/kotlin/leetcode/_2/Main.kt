package leetcode._2

import extentions.displayFormatted
import utils.LinkedListUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the length of the first LinkedList: ")
    val length1 = scanner.nextInt()

    val array1 = IntArray(length1)
    for (index in array1.indices) {
        print("Enter element at index $index: ")
        array1[index] = scanner.nextInt()
    }

    print("Enter the length of the second LinkedList: ")
    val length2 = scanner.nextInt()

    val array2 = IntArray(length2)
    for (index in array2.indices) {
        print("Enter element at index $index: ")
        array2[index] = scanner.nextInt()
    }

    val l1 = LinkedListUtils.createFromIntArray(array1)
    val l2 = LinkedListUtils.createFromIntArray(array2)

    val solution = Solution()
    val output = solution.addTwoNumbers(l1, l2)
    output?.displayFormatted()
}

