package leetcode._1629

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val releaseTimes = IntArray(size)
    for (index in releaseTimes.indices) {
        print("Enter the value at index $index: ")
        releaseTimes[index] = scanner.nextInt()
    }

    print("Enter the keys pressed: ")
    val keysPressed = scanner.next()

    val solution = Solution()
    val output = solution.slowestKey(releaseTimes, keysPressed)

    println("Slowest key: $output")
}