package leetcode._1742

class Solution {

    fun countBalls(lowLimit: Int, highLimit: Int): Int {
        val countArray = IntArray(46)

        for (number in lowLimit..highLimit) {
            var num = number

            var sum = 0
            while (num != 0) {
                sum += num % 10
                num /= 10
            }

            countArray[sum]++
        }

        var output = 0
        for (index in countArray.indices) {
            if (countArray[index] > output) {
                output = countArray[index]
            }
        }
        return output
    }
}