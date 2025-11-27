package leetcode._482

class Solution {

    fun licenseKeyFormatting(s: String, k: Int): String {
        var kc = 0
        val rlk = StringBuilder()

        for (index in s.length - 1 downTo 0) {
            if (s[index] != '-') {
                if (kc == k) {
                    rlk.append('-')
                    kc = 0
                }
                rlk.append(s[index].uppercaseChar())
                kc++
            }
        }

        return rlk.reverse().toString()
    }
}