package leetcode._520

class Solution {
    fun detectCapitalUse(word: String): Boolean {
        val upperCase = word[0].isUpperCase()
        var lowerCaseIndex1: Boolean? = null
        var output = true

        for (index in 1 until word.length) {
            if (upperCase) {
                if (index == 1) {
                    lowerCaseIndex1 = word[index].isLowerCase()
                } else {
                    if (lowerCaseIndex1 == true) {
                        if (word[index].isUpperCase()) {
                            output = false
                            break
                        }
                    } else {
                        if (word[index].isLowerCase()) {
                            output = false
                            break
                        }
                    }
                }
            } else if (word[index].isUpperCase()) {
                output = false
                break
            }
        }

        return output
    }
}