package leetcode._3083

class Solution {

    fun isSubstringPresent(s: String): Boolean {
        if (s.length != 1) {
            for (i in 1 until s.length) {
                val reverse = "${s[i]}${s[i - 1]}"
                var reverseIndex = 0
                var j = 0
                var start = 0

                while (j < s.length) {
                    if (s[j] == reverse[reverseIndex]) {
                        start = j
                        j++
                        reverseIndex++
                        if (reverseIndex == 2) {
                            return true
                        }
                    } else {
                        j = start + 1
                        start = j
                        reverseIndex = 0
                    }
                }
            }
        }

        return false
    }
}