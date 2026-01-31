package leetcode._2399

class Solution {

    fun checkDistances(s: String, distance: IntArray): Boolean {
        val map = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                val dist = i - map.getValue(s[i]) - 1
                if (dist != distance[s[i] - 'a']) {
                    return false
                }
            } else {
                map[s[i]] = i
            }
        }

        return true
    }
}