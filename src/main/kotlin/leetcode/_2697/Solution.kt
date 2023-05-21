package leetcode._2697

class Solution {

    fun makeSmallestPalindrome(s: String): String {
        val output = s.toCharArray()

        var low = 0
        var high = output.size - 1

        while (low < high) {
            val min = if (output[low] < output[high]) {
                output[low]
            } else {
                output[high]
            }
            output[low] = min
            output[high] = min
            low++
            high--
        }

        return String(output)
    }
}