package leetcode._2710

class Solution {

    fun removeTrailingZeros(num: String): String {
        var count = 0

        for (index in num.length - 1 downTo 0) {
            if (num[index] == '0') {
                count++
            } else {
                break
            }
        }

        return num.substring(0, num.length - count)
    }
}