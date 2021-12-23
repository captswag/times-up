package leetcode._28

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var output = -1
        if (needle.isEmpty()) {
            output = 0
        } else {
            var originalIndex = 0
            var haystackIndex = 0
            var needleIndex = 0

            outer@ while (haystackIndex < haystack.length) {
                val haystackChar = haystack[haystackIndex]

                if (needleIndex >= needle.length) {
                    output = originalIndex
                    break@outer
                }

                val needleChar = needle[needleIndex]

                if (haystackChar == needleChar) {
                    // Continue
                    haystackIndex++
                    needleIndex++
                } else {
                    // Reset haystack index to the original index + 1
                    needleIndex = 0
                    originalIndex++
                    haystackIndex = originalIndex
                }
            }
            if (needleIndex >= needle.length) {
                output = originalIndex
            }
        }
        return output
    }
}