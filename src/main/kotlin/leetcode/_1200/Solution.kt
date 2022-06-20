package leetcode._1200

import java.util.*

class Solution {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        Arrays.sort(arr)

        var minDiff = Int.MAX_VALUE
        for (index in 1 until arr.size) {
            if (arr[index] - arr[index - 1] < minDiff) {
                minDiff = arr[index] - arr[index - 1]
            }
        }

        val output = mutableListOf<List<Int>>()
        for (index in 1 until arr.size) {
            if (arr[index] - arr[index - 1] == minDiff) {
                output.add(listOf(arr[index - 1], arr[index]))
            }
        }
        return output
    }
}