package leetcode._599

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the first string array: ")
    val size1 = scanner.nextInt()

    val list1 = mutableListOf<String>()
    var index = 0
    while (index < size1) {
        print("Enter the value at index $index: ")
        list1.add(index, scanner.next())
        index++
    }

    print("Enter the size of the second string array: ")
    val size2 = scanner.nextInt()

    val list2 = mutableListOf<String>()
    index = 0
    while (index < size2) {
        print("Enter the value at index $index: ")
        list2.add(index, scanner.next())
        index++
    }

    val solution = Solution()
    val output = solution.findRestaurant(list1.toTypedArray(), list2.toTypedArray())

    output.displayFormatted()
}