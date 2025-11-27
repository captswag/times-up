package leetcode._3402

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows: ")
    val m = scanner.nextInt()

    print("Enter the number of columns: ")
    val n = scanner.nextInt()

    val grid = Array(m) { IntArray(n) }
    for (mi in grid.indices) {
        println("Row: $mi")
        for (ni in grid[0].indices) {
            print("Enter the value at column $ni: ")
            grid[mi][ni] = scanner.nextInt()
        }
    }

    val solution = Solution()
    val output = solution.minimumOperations(grid)

    println("Minimum number of operations needed to make all columns of grid strictly increasing is $output")
}