package refresh._66

class Solution {

    fun plusOne(digits: IntArray): IntArray {
        val res = IntArray(digits.size + 1)
        var c = 1

        for (i in digits.size - 1 downTo 0) {
            var sum = digits[i] + c
            c = sum / 10
            sum %= 10
            res[i + 1] = sum
        }

        if (c == 1) {
            res[0] = c
        }

        return if (c == 1) {
            res
        } else {
            res.copyOfRange(1, res.size)
        }
    }
}