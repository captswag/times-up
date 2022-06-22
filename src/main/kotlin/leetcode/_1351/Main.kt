package leetcode._1351

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of m: ")
    val m = scanner.nextInt()

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val grid = Array(m) { IntArray(n) }
    for (m in grid.indices) {
        println("Row: $m")
        for (n in grid[m].indices) {
            print("Enter the value at column $n: ")
            grid[m][n] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.countNegatives(grid)

    println("There are $output negative numbers in the grid")
}