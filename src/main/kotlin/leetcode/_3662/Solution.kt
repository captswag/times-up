package leetcode._3662

class Solution {

    fun filterCharacters(s: String, k: Int): String {
        val frequency = IntArray(26)

        for (c in s) {
            frequency[c - 'a']++
        }

        val output = StringBuilder()
        for (c in s) {
            if (frequency[c - 'a'] in 1 until k) {
                output.append(c)
            }
        }

        return output.toString()
    }
}