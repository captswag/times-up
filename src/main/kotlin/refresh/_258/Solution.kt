package refresh._258

class Solution {

    fun addDigits(num: Int): Int {
        var n = num

        while (n > 9) {
            var sum = 0
            while (n != 0) {
                sum += n % 10
                n /= 10
            }
            n = sum
        }

        return n
    }
}