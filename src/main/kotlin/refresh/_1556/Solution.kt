package refresh._1556

class Solution {

    fun thousandSeparator(n: Int): String {
        return if (n == 0) {
            "0"
        } else {
            val res = StringBuilder()
            var k = 0
            var num = n

            while (num != 0) {
                if (k != 0 && k % 3 == 0) {
                    res.append('.')
                }
                res.append(num % 10)
                k++
                num /= 10
            }

            return res.reverse().toString()
        }
    }
}