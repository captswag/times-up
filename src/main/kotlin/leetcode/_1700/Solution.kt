package leetcode._1700

import java.util.*

class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        var countStudents0 = 0
        var countStudents1 = 0

        var countSandwiches0 = 0
        var countSandwiches1 = 0

        for (student in students) {
            if (student == 0) {
                countStudents0++
            } else {
                countStudents1++
            }
        }

        for (sandwich in sandwiches) {
            if (sandwich == 0) {
                countSandwiches0++
            } else {
                countSandwiches1++
            }
        }

        return if (countStudents0 == countSandwiches0) {
            0
        } else {
            val output = LinkedList<Int>()
            for (student in students) {
                output.add(student)
            }

            var index = 0
            while (output.isNotEmpty()) {
                val student = output.remove()
                if (student == sandwiches[index]) {
                    index++
                    if (student == 0) {
                        countStudents0--
                    } else {
                        countStudents1--
                    }
                } else {
                    // Check if the queue is entirely of students with similar craving
                    if (countStudents0 == 0 || countStudents1 == 0) {
                        break
                    } else {
                        output.add(student)
                    }
                }
            }
            output.size + 1
        }
    }
}