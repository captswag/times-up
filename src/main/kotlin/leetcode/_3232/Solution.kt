package leetcode._3232

class Solution {

    fun canAliceWin(nums: IntArray): Boolean {
        var singleDigitSum = 0
        var doubleDigitSum = 0

        for (num in nums) {
            if (num < 10) {
                singleDigitSum += num
            } else {
                doubleDigitSum += num
            }
        }

        return singleDigitSum != doubleDigitSum
    }
}