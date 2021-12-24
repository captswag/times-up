package leetcode._2011

class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var value = 0

        for (operation in operations) {
            when (operation) {
                "++X", "X++" -> value++
                "--X", "X--" -> value--
            }
        }

        return value
    }
}