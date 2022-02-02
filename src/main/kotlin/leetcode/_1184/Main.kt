package leetcode._1184

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val distance = IntArray(size)
    for (index in distance.indices) {
        print("Enter the value at index $index: ")
        distance[index] = scanner.nextInt()
    }

    print("Enter start position: ")
    val start = scanner.nextInt()

    print("Enter the destination: ")
    val destination = scanner.nextInt()

    val solution = Solution()
    val output = solution.distanceBetweenBusStops(distance, start, destination)

    println("The shortest distance to the destination is: $output")
}