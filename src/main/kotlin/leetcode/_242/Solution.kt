package leetcode._242

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Int>()

        for (c in s) {
            val count = map[c]
            if (count == null) {
                map[c] = 1
            } else {
                map[c] = count + 1
            }
        }

        var output = true

        for (c in t) {
            val count = map[c]
            if (count == null) {
                output = false
                break
            } else if (count == 1) {
                map.remove(c)
            } else {
                map[c] = count - 1
            }
        }

        if (map.isNotEmpty()) {
            output = false
        }

        return output
    }
}