package leetcode._2446

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val event1 = Array(2) { "" }
    print("Enter the start time for event 1: ")
    event1[0] = scanner.next()
    print("Enter the end time for event 1: ")
    event1[1] = scanner.next()

    val event2 = Array(2) { "" }
    print("Enter the start time for event 2: ")
    event2[0] = scanner.next()
    print("Enter the end time for event 2: ")
    event2[1] = scanner.next()

    val solution = Solution()
    val output = solution.haveConflict(event1, event2)

    if (output) {
        println("There is a conflict between the two events")
    } else {
        println("There is no conflict between the two events")
    }
}