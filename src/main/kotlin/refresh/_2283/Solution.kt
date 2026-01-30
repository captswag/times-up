package refresh._2283

class Solution {

    fun digitCount(num: String): Boolean {
        val frequency = IntArray(10)

        for (n in num) {
            frequency[n - '0']++
        }

        for (i in num.indices) {
            if (num[i] - '0' != frequency[i]) {
                return false
            }
        }

        return true
    }
}