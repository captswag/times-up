package leetcode._252

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val intervals = Array(size) { IntArray(2) }
    for (index in intervals.indices) {
        println("Index: $index")
        print("Enter the value of start: ")
        val start = scanner.nextInt()
        print("Enter the value of end: ")
        val end = scanner.nextInt()
        intervals[index] = intArrayOf(start, end)
    }

    val solution = Solution()
    val output = solution.canAttendMeetings(intervals)

    if (output) {
        println("The person can attend all meetings")
    } else {
        println("The person cannot attend all meetings")
    }
}
