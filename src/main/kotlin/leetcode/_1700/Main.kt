package leetcode._1700

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val students = IntArray(size)
    for (index in students.indices) {
        print("Enter the value at index $index: ")
        students[index] = scanner.nextInt()
    }

    val sandwiches = IntArray(size)
    for (index in students.indices) {
        print("Enter the value at index $index: ")
        sandwiches[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.countStudents(students, sandwiches)

    println("Number of students who are unable to eat lunch is: $output")
}