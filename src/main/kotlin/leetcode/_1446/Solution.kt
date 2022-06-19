package leetcode._1446

class Solution {
    fun maxPower(s: String): Int {
        var output = 0
        var count = 1
        var index = 0
        var prev = s[index]
        index++

        while (index <= s.length) {
            if (index == s.length) {
                if (count > output) {
                    output = count
                }
            } else if (s[index] == prev) {
                count++
            } else {
                if (count > output) {
                    output = count
                }
                count = 1
                prev = s[index]
            }
            index++
        }

        return output
    }
}