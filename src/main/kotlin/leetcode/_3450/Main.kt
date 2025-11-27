package leetcode._3450

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val students = Array(size) { IntArray(2) }
    for (index in students.indices) {
        print("Enter the student id: ")
        val studentId = scanner.nextInt()
        print("Enter the bench id: ")
        val benchId = scanner.nextInt()
        students[index] = intArrayOf(studentId, benchId)
    }

    val solution = Solution()
    val output = solution.maxStudentsOnBench(students)

    println("The maximum number of unique students on a single bench is $output")
}