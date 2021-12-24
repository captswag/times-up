package leetcode._21

import extentions.displayFormatted
import utils.LinkedListUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the length of the first LinkedList: ")
    val length1 = scanner.nextInt()
    val array1 = IntArray(length1)
    for (index in array1.indices) {
        print("Enter the elements in the LinkedList at index $index: ")
        array1[index] = scanner.nextInt()
    }

    print("Enter the length of the second LinkedList: ")
    val length2 = scanner.nextInt()
    val array2 = IntArray(length2)
    for (index in array2.indices) {
        print("Enter the elements in the LinkedList at index $index: ")
        array2[index] = scanner.nextInt()
    }

    val linkedList1 = LinkedListUtils.createFromIntArray(array1)
    val linkedList2 = LinkedListUtils.createFromIntArray(array2)

    val solution = Solution()
    val output = solution.mergeTwoLists(linkedList1, linkedList2)

    output?.displayFormatted()
}