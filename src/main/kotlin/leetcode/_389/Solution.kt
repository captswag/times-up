package leetcode._389

class Solution {
    fun findTheDifference(s: String, t: String): Char {
        val sSum = findSum(s)
        val tSum = findSum(t)
        val diff = tSum - sSum
        return diff.toChar()
    }

    private fun findSum(string: String): Int {
        var sum = 0
        for (char in string) {
            sum += char.toInt()
        }
        return sum
    }
}