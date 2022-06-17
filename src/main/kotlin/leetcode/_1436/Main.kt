package leetcode._1436

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the paths array: ")
    val size = scanner.nextInt()

    val paths = mutableListOf<List<String>>()
    for (index in 0 until size) {
        print("Enter the value of city A: ")
        val cityA = scanner.next()
        print("Enter the value of city B: ")
        val cityB = scanner.next()
        paths.add(listOf(cityA, cityB))
    }

    val solution = Solution()
    val output = solution.destCity(paths)

    println("The destination city is $output")
}