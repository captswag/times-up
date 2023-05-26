package leetcode._989

class Solution {
    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        val output = mutableListOf<Int>()
        var lastIndex = num.size
        var secondNumber = k

        while (--lastIndex >= 0 || secondNumber != 0) {
            val num1 = getDigit(num, lastIndex)
            secondNumber += num1

            output.add(secondNumber % 10)
            secondNumber /= 10
        }

        return output.reversed()
    }

    private fun getDigit(num: IntArray, index: Int): Int {
        return if (index < 0) {
            0
        } else {
            num[index]
        }
    }
}