package leetcode._28

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var haystackIndex = 0
        var needleIndex = 0

        while (haystackIndex < haystack.length) {
            if (haystack[haystackIndex] == needle[needleIndex]) {
                val currentIndex = haystackIndex
                haystackIndex++
                needleIndex++
                while (haystackIndex < haystack.length && needleIndex < needle.length && haystack[haystackIndex] == needle[needleIndex]) {
                    haystackIndex++
                    needleIndex++
                }
                if (needleIndex == needle.length) {
                    return currentIndex
                } else {
                    haystackIndex = currentIndex + 1
                    needleIndex = 0
                }
            } else {
                haystackIndex++
            }
        }

        return -1
    }
}