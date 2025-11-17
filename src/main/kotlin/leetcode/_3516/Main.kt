package leetcode._3516

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of x: ")
    val x = scanner.nextInt()

    print("Enter the value of y: ")
    val y = scanner.nextInt()

    print("Enter the value of z: ")
    val z = scanner.nextInt()

    val solution = Solution()
    val output = solution.findClosest(x, y, z)

    if (output == 0) {
        println("Both arrive at the same time")
    } else if (output == 1) {
        println("Person 1 arrives first")
    } else {
        println("Person 2 arrives first")
    }
}