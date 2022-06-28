package leetcode._1331

import java.util.*

class Solution {
    fun arrayRankTransform(arr: IntArray): IntArray {
        val arrCopy = arr.copyOf()
        Arrays.sort(arrCopy)

        var rank = 1
        val map = mutableMapOf<Int, Int>()
        for (index in arrCopy.indices) {
            if (index == 0 || arrCopy[index] == arrCopy[index - 1]) {
                map[arrCopy[index]] = rank
            } else if (arrCopy[index] != arrCopy[index - 1]) {
                map[arrCopy[index]] = ++rank
            }
        }

        val output = IntArray(arr.size)
        for (index in arr.indices) {
            output[index] = map.getOrDefault(arr[index], -1)
        }

        return output
    }
}