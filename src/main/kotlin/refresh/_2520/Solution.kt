package refresh._2520

class Solution {

    fun countDigits(num: Int): Int {
        var n = num
        var cnt = 0

        while (n != 0) {
            if (num % (n % 10) == 0) {
                cnt++
            }
            n /= 10
        }

        return cnt
    }
}