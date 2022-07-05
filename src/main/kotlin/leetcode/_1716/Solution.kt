package leetcode._1716

class Solution {
    fun totalMoney(n: Int): Int {
        val countArray = intArrayOf(0, 1, 2, 3, 4, 5, 6)
        var countArrayIndex = 0
        var output = 0

        for (index in 0 until n) {
            countArray[countArrayIndex]++
            output += countArray[countArrayIndex]
            if (countArrayIndex + 1 == 7) {
                countArrayIndex = 0
            } else {
                countArrayIndex++
            }
        }

        return output
    }
}