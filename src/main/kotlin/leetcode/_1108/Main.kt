package leetcode._1108

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the address: ")
    val address = scanner.next()

    val solution = Solution()
    val output = solution.defangIPaddr(address)

    println("The defanged IP address is: $output")
}