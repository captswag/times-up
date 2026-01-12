package refresh._1796

class Solution {

    fun secondHighest(s: String): Int {
        var largest = -1
        var secondLargest = -1

        for (c in s) {
            if (c.isDigit()) {
                val digit = c - '0'
                if (digit > largest) {
                    secondLargest = largest
                    largest = digit
                } else if (digit != largest && digit > secondLargest) {
                    secondLargest = digit
                }
            }
        }

        return secondLargest
    }
}