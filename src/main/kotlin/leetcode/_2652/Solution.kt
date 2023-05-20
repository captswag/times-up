package leetcode._2652

class Solution {

    fun sumOfMultiples(n: Int): Int {
        var output = 0

        for (number in 1..n) {
            if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
                output += number
            }
        }

        return output
    }
}