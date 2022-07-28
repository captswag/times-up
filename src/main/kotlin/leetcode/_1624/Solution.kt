package leetcode._1624

class Solution {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        val indexArray = IntArray(26) { -1 }
        var output = -1

        for (index in s.indices) {
            val firstIndex = indexArray[s[index] - 'a']
            if (firstIndex == -1) {
                indexArray[s[index] - 'a'] = index
            } else {
                val diff = index - firstIndex - 1
                if (diff > output) {
                    output = diff
                }
            }
        }

        return output
    }
}