package refresh._1394

class Solution {

    fun findLucky(arr: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        for (num in arr) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        var luckyInteger = -1
        for (key in map.keys) {
            if (key == map.getValue(key)) {
                if (key > luckyInteger) {
                    luckyInteger = key
                }
            }
        }

        return luckyInteger
    }
}