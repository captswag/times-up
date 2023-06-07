package leetcode._2409

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the date on which Alice arrived: ")
    val arriveAlice = scanner.next()

    print("Enter the date on which Alice left: ")
    val leaveAlice = scanner.next()

    print("Enter the date on which Bob arrived: ")
    val arriveBob = scanner.next()

    print("Enter the date on which Bob left: ")
    val leaveBob = scanner.next()

    val solution = Solution()
    val output = solution.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob)

    println("Alice and Bob spent $output days together")
}