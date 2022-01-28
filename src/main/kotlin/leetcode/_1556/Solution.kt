package leetcode._1556

class Solution {
    fun thousandSeparator(n: Int): String {
        var number = n
        val sb = StringBuilder()

        var count = 0
        while (number != 0) {
            if (count == 3) {
                sb.insert(0, '.')
                count = 0
            } else {
                sb.insert(0, number % 10)
                number /= 10
                count++
            }
        }

        return if (sb.toString() == "") { // This means the input number is 0
            "0"
        } else sb.toString()
    }
}