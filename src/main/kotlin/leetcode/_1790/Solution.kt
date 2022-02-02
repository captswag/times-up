package leetcode._1790

class Solution {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        val swapArray = CharArray(26)
        var swapFlag = false
        var swapComplete = false
        var output = true

        for (index in s1.indices) {
            val s1Char = s1[index]
            val s2Char = s2[index]

            if (s1Char == s2Char) {
                // Continue
            } else {
                // Check if there is an existing swap
                if (swapComplete) {
                    output = false
                    break
                } else if (swapFlag) {
                    // Check if the swaps are correct
                    if (swapArray[s1Char - 'a'] == s2Char) {
                        swapComplete = true
                    } else {
                        output = false
                        break
                    }
                } else {
                    swapFlag = true
                    swapArray[s2Char - 'a'] = s1Char
                }
            }
        }

        return if (swapFlag && !swapComplete) {
            false
        } else {
            output
        }
    }
}