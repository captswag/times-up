package refresh._3663

class Solution {

    fun getLeastFrequentDigit(n: Int): Int {
        var x = n
        val freq = IntArray(10)

        while (x != 0) {
            freq[x % 10]++
            x /= 10
        }

        var mn = Int.MAX_VALUE
        var ans = -1

        for (i in freq.indices) {
            if (freq[i] in 1 until mn) {
                mn = freq[i]
                ans = i
            }
        }

        return ans
    }
}