package leetcode._3248

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    print("Enter the size of the commands array: ")
    val size = scanner.nextInt()

    val commands = mutableListOf<String>()
    for (index in 0 until size) {
        print("Enter the value at index $index: ")
        commands.add(scanner.next())
    }

    val solution = Solution()
    val output = solution.finalPositionOfSnake(n, commands)

    println("Position of the final cell is $output")
}