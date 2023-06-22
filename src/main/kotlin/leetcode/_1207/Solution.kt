package leetcode._1207

class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()

        for (num in arr) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        var uniqueOccurrence = true
        val set = mutableSetOf<Int>()

        for (key in map.keys) {
            val count = map.getValue(key)
            if (set.contains(count)) {
                uniqueOccurrence = false
                break
            } else {
                set.add(count)
            }
        }

        return uniqueOccurrence
    }
}