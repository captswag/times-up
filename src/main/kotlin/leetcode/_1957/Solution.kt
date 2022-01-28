package leetcode._1957

class Solution {
    fun makeFancyString(s: String): String {
        val sb = StringBuilder()

        var prev = s[0]
        sb.append(prev)
        var count = 1

        for (index in 1 until s.length) {
            if (prev == s[index]) {
                count++
                if (count < 3) {
                    sb.append(s[index])
                }
            } else {
                sb.append(s[index])
                count = 1
            }
            prev = s[index]
        }

        return sb.toString()
    }
}