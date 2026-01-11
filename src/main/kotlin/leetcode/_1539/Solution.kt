package leetcode._1539

class Solution {

    fun findKthPositive(arr: IntArray, k: Int): Int {
        var i = 0
        var number = 1
        var missingNumbersCount = 0

        while (true) {
            if (i < arr.size && arr[i] == number) {
                i++
                number++
            } else {
                missingNumbersCount++
                if (missingNumbersCount == k) {
                    return number
                } else {
                    number++
                }
            }
        }
    }
}