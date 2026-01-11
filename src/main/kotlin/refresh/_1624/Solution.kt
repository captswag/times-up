package refresh._1624

class Solution {

    fun maxLengthBetweenEqualCharacters(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        var maxLargest = -1

        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                maxLargest = Math.max(maxLargest, i - map.getValue(s[i]) - 1)
            } else {
                map[s[i]] = i
            }
        }

        return maxLargest
    }
}