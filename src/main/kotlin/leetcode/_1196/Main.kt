package leetcode._1196

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the weight array: ")
    val size = scanner.nextInt()

    val weight = IntArray(size)
    for (index in weight.indices) {
        print("Enter the value at index $index: ")
        weight[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.maxNumberOfApples(weight)

    println("Max number of Apples that can be put into the basket is: $output")
}