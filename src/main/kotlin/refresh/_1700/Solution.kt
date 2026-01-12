package refresh._1700

class Solution {

    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val studentsQueue = ArrayDeque<Int>()

        for (student in students) {
            studentsQueue.addLast(student)
        }

        var sandwichesIndex = 0
        while (studentsQueue.isNotEmpty()) {
            var studentIndex = 0
            val studentsSize = studentsQueue.size
            while (studentIndex < studentsSize) {
                val student = studentsQueue.removeFirst()
                if (student == sandwiches[sandwichesIndex]) {
                    sandwichesIndex++
                    break
                } else {
                    studentsQueue.addLast(student)
                }
                studentIndex++
            }
            if (studentIndex == studentsSize) {
                break
            }
        }

        return studentsQueue.size
    }
}