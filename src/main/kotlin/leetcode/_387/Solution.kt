package leetcode._387

class Solution {
    fun firstUniqChar(s: String): Int {
        val map = HashMap<Char, Int>()

        for (char in s) {
            val count = map[char]
            if (count == null) {
                map[char] = 1
            } else {
                map[char] = count + 1
            }
        }

        var uniqCharacterIndex = -1
        for (index in s.indices) {
            val char = s[index]
            if (map[char] == 1) {
                uniqCharacterIndex = index
                break
            }
        }

        return uniqCharacterIndex
    }
}