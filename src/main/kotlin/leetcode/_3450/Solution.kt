package leetcode._3450

class Solution {

    fun maxStudentsOnBench(students: Array<IntArray>): Int {
        var maxStudents = 0

        if (students.isNotEmpty()) {
            val benchCount = IntArray(101)
            val uniqueStudents = mutableSetOf<Int>()

            maxStudents = Math.max(maxStudents, ++benchCount[students[0][1]])
            uniqueStudents.add(students[0][0])

            for (index in 1 until students.size) {
                if (students[index][1] == students[index - 1][1]) {
                    if (students[index][0] !in uniqueStudents) {
                        maxStudents = Math.max(maxStudents, ++benchCount[students[index][1]])
                        uniqueStudents.add(students[index][0])
                    }
                } else {
                    uniqueStudents.clear()
                    maxStudents = Math.max(maxStudents, ++benchCount[students[index][1]])
                    uniqueStudents.add(students[index][0])
                }
            }
        }

        return maxStudents
    }
}