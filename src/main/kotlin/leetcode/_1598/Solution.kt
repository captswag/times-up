package leetcode._1598

class Solution {
    fun minOperations(logs: Array<String>): Int {
        var output = 0

        for (log in logs) {
            when (log) {
                "../" -> {
                    if (output != 0) {
                        output--
                    }
                }
                "./" -> {
                    // Do nothing
                }
                else -> {
                    output++
                }
            }
        }

        return output
    }
}