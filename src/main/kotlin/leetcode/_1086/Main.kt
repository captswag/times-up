package leetcode._1086

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val items = Array(size) { IntArray(2) }
    for (index in items.indices) {
        println("Index: $index")
        print("Enter the id: ")
        val id = scanner.nextInt()
        print("Enter the mark: ")
        val mark = scanner.nextInt()
        items[index] = intArrayOf(id, mark)
    }

    val solution = Solution()
    val output = solution.highFive(items)

    for (index in output.indices) {
        print("Index $index: ")
        output[index].displayFormatted()
    }
}