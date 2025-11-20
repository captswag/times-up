package leetcode._3442

class Solution {

    fun maxDifference(s: String): Int {
        val frequency = IntArray(26)

        for (c in s) {
            frequency[c - 'a']++
        }

        var maxOdd = 0
        var minEven = 100
        for (f in frequency) {
            if (f and 1 == 0) {
                if (f != 0 && f < minEven) {
                    minEven = f
                }
            } else {
                if (f > maxOdd) {
                    maxOdd = f
                }
            }
        }

        return maxOdd - minEven
    }
}