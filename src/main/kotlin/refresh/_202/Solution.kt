package refresh._202

class Solution {

    fun isHappy(n: Int): Boolean {
        val seen = mutableSetOf<Int>()
        var x = n

        while (x !in seen) {
            seen.add(x)
            var sum = 0

            while (x != 0) {
                val d = x % 10
                sum += (d * d)
                x /= 10
            }

            if (sum == 1) {
                return true
            } else {
                x = sum
            }
        }

        return false
    }
}