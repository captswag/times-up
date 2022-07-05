package leetcode._2068

class Solution {
    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val countArray1 = IntArray(26)
        val countArray2 = IntArray(26)

        for (c in word1) {
            countArray1[c - 'a']++
        }

        for (c in word2) {
            countArray2[c - 'a']++
        }

        var output = true
        for (index in countArray1.indices) {
            if (Math.abs(countArray1[index] - countArray2[index]) > 3) {
                output = false
                break
            }
        }
        return output
    }
}