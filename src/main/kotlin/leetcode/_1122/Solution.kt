package leetcode._1122

class Solution {

    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val frequency = mutableMapOf<Int, Int>()

        for (value in arr2) {
            frequency[value] = 0
        }

        val remaining = mutableListOf<Int>()

        for (value in arr1) {
            if (frequency.containsKey(value)) {
                frequency[value] = frequency.getOrDefault(value, 0) + 1
            } else {
                remaining.add(value)
            }
        }

        val res = IntArray(arr1.size)
        var index = 0

        for (key in frequency.keys) {
            val count = frequency.getValue(key)
            repeat(count) {
                res[index++] = key
            }
        }

        remaining.sort()

        for (value in remaining) {
            res[index++] = value
        }

        return res
    }
}