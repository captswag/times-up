package leetcode._409

class Solution {
    fun longestPalindrome(s: String): Int {
        // Let's solve using HashSet
        val set = mutableSetOf<Char>()

        var length = 0
        for (c in s) {
            if (set.contains(c)) {
                length += 2
                set.remove(c)
            } else {
                set.add(c)
            }
        }

        return if (set.isNotEmpty()) {
            ++length
        } else {
            length
        }
    }
}