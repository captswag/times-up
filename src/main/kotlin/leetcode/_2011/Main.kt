package leetcode._2011

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val listOfOperations = mutableListOf<String>()
    for (index in 0 until size) {
        listOfOperations.add(scanner.next())
    }

    val solution = Solution()
    val output = solution.finalValueAfterOperations(listOfOperations.toTypedArray())

    println("The final value after performing operations is: $output")
}