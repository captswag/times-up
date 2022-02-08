package leetcode._1207

class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()

        for (num in arr) {
            val count = map[num]
            if (count == null) {
                map[num] = 1
            } else {
                map[num] = count + 1
            }
        }

        var output = true
        val set = mutableSetOf<Int>()

        for (key in map.keys) {
            val count = map[key]
            if (count != null) {
                if (set.contains(count)) {
                    output = false
                } else {
                    set.add(count)
                }
            }
        }

        return output
    }
}