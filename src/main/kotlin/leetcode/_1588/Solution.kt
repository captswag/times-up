package leetcode._1588

class Solution {

    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var output = 0

        for (window in 1..arr.size step 2) {
            var prevSum = 0

            for (index in 0 until window) {
                prevSum += arr[index]
            }
            output += prevSum

            var index = 1
            while (index + window <= arr.size) {
                prevSum = prevSum + arr[index + window - 1] - arr[index - 1]
                output += prevSum
                index++
            }
        }

        return output
    }
}