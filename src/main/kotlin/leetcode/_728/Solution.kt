package leetcode._728

class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val output = mutableListOf<Int>()
        var current = left

        while (current <= right) {
            if (isSelfDivisible(current)) {
                output.add(current)
            }
            current++
        }

        return output
    }

    private fun isSelfDivisible(number: Int): Boolean {
        var num = number
        var divisible = true
        while (num != 0) {
            val mod = num % 10
            if (!(mod != 0 && number % mod == 0)) {
                divisible = false
                break
            }
            num /= 10
        }
        return divisible
    }
}

