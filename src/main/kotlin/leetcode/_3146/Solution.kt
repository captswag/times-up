package leetcode._3146

class Solution {

    fun findPermutationDifference(s: String, t: String): Int {
        val sCharArray = IntArray(26)

        for (index in s.indices) {
            sCharArray[s[index] - 'a'] = index
        }

        var result = 0
        for (index in t.indices) {
            result += Math.abs(index - sCharArray[t[index] - 'a'])
        }

        return result
    }
}