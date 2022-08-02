package leetcode._1854

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val logs = Array(size) { IntArray(2) }
    for (index in logs.indices) {
        print("Index: $index")
        print("Enter the birth year: ")
        val birth = scanner.nextInt()
        print("Enter the death year: ")
        val death = scanner.nextInt()
        logs[index] = intArrayOf(birth, death)
    }

    val solution = Solution()
    val output = solution.maximumPopulation(logs)

    println("Maximum population year is: $output")
}