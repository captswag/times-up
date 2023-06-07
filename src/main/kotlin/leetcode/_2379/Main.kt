package leetcode._2379

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value for blocks: ")
    val blocks = scanner.next()

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.minimumRecolors(blocks, k)

    println("Minimum recolors to get $k consecutive blocks is: $output")
}