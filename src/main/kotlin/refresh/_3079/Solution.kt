package refresh._3079

class Solution {

    fun sumOfEncryptedInt(nums: IntArray): Int {
        var sum = 0

        for (num in nums) {
            var x = num
            var mx = 0
            while (x != 0) {
                val cur = x % 10
                if (cur > mx) {
                    mx = cur
                }
                x /= 10
            }

            x = 0
            for (i in 0 until digits(num)) {
                x = (x * 10) + mx
            }

            sum += x
        }

        return sum
    }

    private fun digits(n: Int): Int {
        return when {
            n < 10 -> 1
            n < 100 -> 2
            n < 1000 -> 3
            else -> 4
        }
    }
}