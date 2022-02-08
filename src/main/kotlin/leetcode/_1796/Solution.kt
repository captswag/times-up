package leetcode._1796

class Solution {
    fun secondHighest(s: String): Int {
        var largest: Int? = null
        var secondLargest: Int? = null

        for (c in s) {
            if (c.isDigit()) {
                val digit = Character.getNumericValue(c)
                if (largest == null) {
                    largest = digit
                } else {
                    if (digit > largest) {
                        secondLargest = largest
                        largest = digit
                    } else if (digit < largest) {
                        // Give it to secondLargest
                        if (secondLargest == null || digit > secondLargest) {
                            secondLargest = digit
                        }
                    }
                }
            }
        }

        return secondLargest ?: -1
    }
}