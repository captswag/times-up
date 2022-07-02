package leetcode._1791

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val edges = Array(size) { IntArray(2) }
    for (index in edges.indices) {
        println("Index: $index")
        print("Enter edge 1: ")
        val edge1 = scanner.nextInt()
        print("Enter edge 2: ")
        val edge2 = scanner.nextInt()
        edges[index] = intArrayOf(edge1, edge2)
    }

    val solution = Solution()
    val output = solution.findCenter(edges)

    println("The center of the star graph is: $output")
}