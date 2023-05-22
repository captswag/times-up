package leetcode._1399

class Solution {

    fun countLargestGroup(n: Int): Int {
        val countArray = IntArray(37)
        var max = 0
        var output = 0

        for (num in 1..n) {
            val sum = findIndividualDigitsSum(num)
            countArray[sum]++

            if (max < countArray[sum]) {
                max = countArray[sum]
                output = 1
            } else if (max == countArray[sum]) {
                output++
            }
        }

        return output
    }

    private fun findIndividualDigitsSum(num: Int): Int {
        var number = num

        var sum = 0
        while (number != 0) {
            sum += number % 10
            number /= 10
        }

        return sum
    }
}