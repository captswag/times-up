package refresh._2053

class Solution {

    fun kthDistinct(arr: Array<String>, k: Int): String {
        val map = mutableMapOf<String, Int>()

        for (s in arr) {
            map[s] = map.getOrDefault(s, 0) + 1
        }

        var count = 0
        for (s in arr) {
            if (map.getValue(s) == 1) {
                count++
                if (count == k) {
                    return s
                }
            }
        }

        return ""
    }
}