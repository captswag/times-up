package leetcode._1678

class Solution {
    fun interpret(command: String): String {
        val output = StringBuilder()
        var index = 0

        while (index < command.length) {
            if (command[index] == '(') {
                index += if (command[index + 1] == ')') {
                    output.append('o')
                    2
                } else {
                    output.append("al")
                    4
                }
            } else {
                output.append('G')
                index++
            }
        }

        return String(output)
    }
}