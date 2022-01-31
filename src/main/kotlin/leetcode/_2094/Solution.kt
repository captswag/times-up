package leetcode._2094

class Solution {
    fun findEvenNumbers(digits: IntArray): IntArray {
        val digitsCount = IntArray(10) // Size 10 because each digit is 0-9

        for (digit in digits) {
            digitsCount[digit] = digitsCount[digit] + 1
        }

        val output = mutableListOf<Int>()

        for (index in 100..998 step 2) {
            var currentDigit = index
            val currentDigitsCount = IntArray(10)

            while (currentDigit > 0) {
                // Find the mod
                val mod = currentDigit % 10
                currentDigitsCount[mod] = currentDigitsCount[mod] + 1
                currentDigit /= 10
            }

            var flag = true
            for (index in digitsCount.indices) {
                if (currentDigitsCount[index] > digitsCount[index]) {
                    flag = false
                    break
                }
            }

            if (flag) {
                output.add(index)
            }
        }

        return output.toIntArray()
    }
}