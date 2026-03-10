package refresh._2729

class Solution {

    fun isFascinating(n: Int): Boolean {
        val freq = IntArray(10)

        for (i in 1..3) {
            var x = i * n
            while (x > 0) {
                freq[x % 10]++
                x /= 10
            }
        }

        for (i in 1 until freq.size) {
            if (freq[i] != 1) {
                return false
            }
        }

        return freq[0] == 0
    }
}