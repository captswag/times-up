package refresh._3498

class Solution {

    fun reverseDegree(s: String): Int {
        var sum = 0

        for (i in s.indices) {
            sum += (26 - (s[i] - 'a')) * (i + 1)
        }

        return sum
    }
}