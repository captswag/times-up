package leetcode._455

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the g IntArray: ")
    val gs = scanner.nextInt()

    val g = IntArray(gs)
    for (index in g.indices) {
        print("Enter the value at index $index: ")
        g[index] = scanner.nextInt()
    }

    print("Enter the size of the s IntArray: ")
    val ss = scanner.nextInt()

    val s = IntArray(ss)
    for (index in s.indices) {
        print("Enter the value at index $index: ")
        s[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.findContentChildren(g, s)

    println("The number of content children is $output")
}