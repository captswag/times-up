package leetcode._1694

class Solution {
    fun reformatNumber(number: String): String {
        var count = 0
        for (num in number) {
            if (num.isDigit()) {
                count++
            }
        }

        val output = StringBuilder()
        var index = 0
        var started = false

        while (count > 0) {
            if (started) {
                output.append('-')
            }
            started = true
            val targetCount = if (count > 4) {
                count - 3
            } else {
                if (count == 4 || count == 2) {
                    count - 2
                } else {
                    count - 3
                }
            }
            while (count > targetCount) {
                if (number[index].isDigit()) {
                    output.append(number[index])
                    count--
                }
                index++
            }
        }

        return String(output)
    }
}