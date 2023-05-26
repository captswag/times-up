package leetcode._67

class Solution {
    fun addBinary(a: String, b: String): String {
        val output = StringBuilder()
        var aLastIndex = a.length - 1
        var bLastIndex = b.length - 1
        var carryOver = 0

        while (aLastIndex >= 0 || bLastIndex >= 0) {
            val aBinary = getDigit(a, aLastIndex--)
            val bBinary = getDigit(b, bLastIndex--)
            val sum = aBinary + bBinary + carryOver

            output.append(sum % 2)
            carryOver = sum / 2
        }

        if (carryOver != 0) {
            output.append(carryOver)
        }

        return String(output.reverse())
    }

    private fun getDigit(a: String, index: Int): Int {
        return if (index < 0) {
            0
        } else {
            return Character.getNumericValue(a[index])
        }
    }
}