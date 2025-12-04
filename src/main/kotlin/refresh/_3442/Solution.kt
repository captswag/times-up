package refresh._3442

class Solution {

    fun maxDifference(s: String): Int {
        val frequency = IntArray(26)

        for (c in s) {
            frequency[c - 'a']++
        }

        var maxOdd = 1
        var minEven = 98

        for (f in frequency) {
            if (f and 1 == 1) {
                if (f > maxOdd) {
                    maxOdd = f
                }
            } else {
                if (f != 0 && f < minEven) {
                    minEven = f
                }
            }
        }

        return maxOdd - minEven
    }
}