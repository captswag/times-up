package leetcode._3120

class Solution {

    fun numberOfSpecialChars(word: String): Int {
        val lowercaseCharArray = IntArray(26)
        val uppercaseCharArray = IntArray(26)

        for (c in word) {
            if (c.isLowerCase()) {
                lowercaseCharArray[c - 'a']++
            } else {
                uppercaseCharArray[c - 'A']++
            }
        }

        var output = 0
        for (index in lowercaseCharArray.indices) {
            if (lowercaseCharArray[index] > 0 && uppercaseCharArray[index] > 0) {
                output++
            }
        }

        return output
    }
}