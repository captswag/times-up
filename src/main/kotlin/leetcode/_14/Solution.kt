package leetcode._14

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var output = ""
        var charIndex = 0
        var charTemp = ' '

        outer@ while (true) {
            for (strsIndex in strs.indices) {
                val str = strs[strsIndex] // Got the independent string
                if (charIndex < str.length) {
                    // Proceed
                    if (strsIndex == 0) {
                        charTemp = str[charIndex]
                    } else if (str[charIndex] != charTemp) {
                        break@outer
                    }
                } else {
                    break@outer
                }
            }
            charIndex++
            output += charTemp
        }
        return output
    }
}