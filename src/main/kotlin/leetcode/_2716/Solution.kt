package leetcode._2716

class Solution {

    fun minimizedStringLength(s: String): Int {
        val set = mutableSetOf<Char>()

        for (c in s) {
            set.add(c)
        }

        return set.size
    }
}