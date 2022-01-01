package leetcode._266

class Solution {
    fun canPermutePalindrome(s: String): Boolean {
        val set = mutableSetOf<Char>()

        for (c in s) {
            if (set.contains(c)) {
                set.remove(c)
            } else {
                set.add(c)
            }
        }

        // Check if the length of the string is even or odd.
        return if (s.length % 2 == 0) {
            set.isEmpty()
        } else {
            set.size == 1
        }
    }
}