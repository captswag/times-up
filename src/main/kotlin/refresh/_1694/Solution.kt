package refresh._1694

class Solution {

    fun reformatNumber(number: String): String {
        var length = 0
        for (c in number) {
            if (c.isDigit()) {
                length++
            }
        }

        var div = length / 3
        var mod = length % 3
        if (mod == 1) {
            mod += 3
            div -= 1
        }

        val ans = CharArray(length + (div - 1) + (mod / 2))
        var ansIndex = 0
        var ansDigitCount = 0
        var numberIndex = 0

        while (numberIndex < number.length && ansDigitCount < (div * 3)) {
            if (number[numberIndex].isDigit()) {
                if (ansDigitCount != 0 && ansDigitCount % 3 == 0) {
                    ans[ansIndex++] = '-'
                }
                ans[ansIndex++] = number[numberIndex]
                ansDigitCount++
            }
            numberIndex++
        }

        if (div != 0 && mod != 0) {
            ans[ansIndex++] = '-'
        }

        ansDigitCount = 0
        while (numberIndex < number.length) {
            if (number[numberIndex].isDigit()) {
                if (ansDigitCount != 0 && ansDigitCount % 2 == 0) {
                    ans[ansIndex++] = '-'
                }
                ans[ansIndex++] = number[numberIndex]
                ansDigitCount++
            }
            numberIndex++
        }

        return String(ans)
    }
}