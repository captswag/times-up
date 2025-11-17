package leetcode._3663

class Solution {

    fun getLeastFrequentDigit(n: Int): Int {
        val frequency = IntArray(10)
        var number = n

        while (number != 0) {
            val mod = number % 10
            frequency[mod]++
            number /= 10
        }

        var result = -1
        var min = Int.MAX_VALUE
        for (index in frequency.size - 1 downTo 0) {
            if (frequency[index] == 0) {
                continue
            } else {
                if (frequency[index] <= min) {
                    min = frequency[index]
                    result = index
                }
            }
        }

        return result
    }
}