package leetcode._167

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val numbers = IntArray(size)
    for (index in numbers.indices) {
        print("Enter the value at index $index: ")
        numbers[index] = scanner.nextInt()
    }

    print("Enter the target: ")
    val target = scanner.nextInt()

    val solution = Solution()
    val output = solution.twoSum(numbers, target)

    output.displayFormatted()
}