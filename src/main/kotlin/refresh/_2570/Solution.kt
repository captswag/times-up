package refresh._2570

import java.util.*

class Solution {

    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        val map = TreeMap<Int, Int>()

        for (x in nums1) {
            map[x[0]] = x[1]
        }

        for (x in nums2) {
            map[x[0]] = map.getOrDefault(x[0], 0) + x[1]
        }

        val ans = Array(map.size) { IntArray(2) }
        var i = 0
        for (key in map.keys) {
            ans[i++] = intArrayOf(key, map.getValue(key))
        }

        return ans
    }
}