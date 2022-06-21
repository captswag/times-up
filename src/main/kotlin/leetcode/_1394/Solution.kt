package leetcode._1394

class Solution {
    fun findLucky(arr: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        for (integer in arr) {
            map[integer] = map.getOrDefault(integer, 0) + 1
        }

        var output = -1
        for (key in map.keys) {
            val count = map[key]
            if (count == key && key > output) {
                output = key
            }
        }
        return output
    }
}