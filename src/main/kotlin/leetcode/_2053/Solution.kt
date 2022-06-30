package leetcode._2053

class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        var output = ""
        val map = mutableMapOf<String, Int>()

        for (word in arr) {
            map[word] = map.getOrDefault(word, 0) + 1
        }

        var kCount = 0
        for (key in map.keys) {
            if (map.getOrDefault(key, 0) == 1) {
                if (++kCount == k) {
                    output = key
                    break
                }
            }
        }

        return output
    }
}