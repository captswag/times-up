package leetcode._1417

class Solution {
    fun reformat(s: String): String {
        var index = 0
        var isDigit = s[index].isDigit()
        var countLetters = if (isDigit) 0 else 1
        var countDigits = if (isDigit) 1 else 0
        var wrongFormat = false
        var firstDigitIndex = if (isDigit) index else -1
        var firstLetterIndex = if (isDigit) -1 else index
        index++

        while (index < s.length) {
            if (!wrongFormat) {
                if (isDigit) {
                    if (s[index].isLetter()) {
                        isDigit = false
                    } else {
                        wrongFormat = true
                    }
                } else {
                    if (s[index].isDigit()) {
                        isDigit = true
                    } else {
                        wrongFormat = true
                    }
                }
            }
            if (s[index].isDigit()) {
                if (firstDigitIndex == -1) {
                    firstDigitIndex = index
                }
                countDigits++
            } else {
                if (firstLetterIndex == -1) {
                    firstLetterIndex = index
                }
                countLetters++
            }
            index++
        }

        return if (wrongFormat) {
            if (Math.abs(countLetters - countDigits) > 1) {
                ""
            } else {
                val output = CharArray(s.length)
                index = 0
                val bigger = if (countLetters == countDigits) {
                    0
                } else if (countLetters > countDigits) {
                    output[index++] = s[firstLetterIndex++]
                    1
                } else {
                    output[index++] = s[firstDigitIndex++]
                    -1
                }
                while (index < output.size) {
                    while (firstLetterIndex < output.size) {
                        if (s[firstLetterIndex].isLetter()) {
                            break
                        } else {
                            firstLetterIndex++
                        }
                    }
                    while (firstDigitIndex < output.size) {
                        if (s[firstDigitIndex].isDigit()) {
                            break
                        } else {
                            firstDigitIndex++
                        }
                    }
                    if (bigger == 1 || bigger == 0) {
                        output[index] = s[firstDigitIndex++]
                        output[index + 1] = s[firstLetterIndex++]
                    } else {
                        output[index] = s[firstLetterIndex++]
                        output[index + 1] = s[firstDigitIndex++]
                    }
                    index += 2
                }
                String(output)
            }
        } else {
            s
        }
    }
}