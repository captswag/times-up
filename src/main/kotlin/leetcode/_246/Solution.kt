package leetcode._246

class Solution {
    fun isStrobogrammatic(num: String): Boolean {
        val map = mapOf('0' to '0', '1' to '1', '6' to '9', '8' to '8', '9' to '6')
        var startIndex = 0
        var endIndex = num.length - 1
        var output = true

        while (startIndex <= endIndex) {
            val startIndexMap = map.getOrDefault(num[startIndex], 'a')
            if (startIndexMap != num[endIndex]) {
                output = false
                break
            }
            startIndex++
            endIndex--
        }

        return output
    }
}