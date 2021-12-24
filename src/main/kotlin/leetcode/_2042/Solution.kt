package leetcode._2042

class Solution {
    fun areNumbersAscending(s: String): Boolean {
        var previousToken: Int? = null
        var tokenString = ""
        var hit = false
        var output = true

        for (char in s) {
            if (char.isDigit()) {
                tokenString += char
                hit = true
            } else {
                if (hit) {
                    if (previousToken == null) {
                        previousToken = tokenString.toInt()
                    } else {
                        if (previousToken < tokenString.toInt()) {
                            previousToken = tokenString.toInt()
                        } else {
                            output = false
                            break
                        }
                    }
                    tokenString = ""
                    hit = false
                }
            }
        }

        if (hit) {
            // This basically means there is some number at the last index
            if (previousToken != null && previousToken >= tokenString.toInt()) {
                output = false
            }
        }
        return output
    }
}