package leetcode._1933

class Solution {
    fun isDecomposable(s: String): Boolean {
        var count = 0
        var prev = 'a' // A value which is not in s
        var substring2 = false
        var output = true

        for (index in 0..s.length) {
            if (index != s.length && s[index] == prev) {
                count++
            } else {
                if (count % 3 != 0) {
                    if (count > 1 && !substring2) {
                        val diff = count - 2
                        if (diff % 3 == 0) {
                            substring2 = true
                        } else {
                            output = false
                            break
                        }
                    } else {
                        output = false
                        break
                    }
                }

                if (index == s.length) {
                    break
                } else {
                    count = 1
                    prev = s[index]
                }
            }
        }

        return substring2 && output
    }
}