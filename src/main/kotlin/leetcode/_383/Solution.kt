package leetcode._383

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = mutableMapOf<Char, Int>()
        var output = true

        for (char in magazine) {
            val count = map[char]
            if (count == null) {
                map[char] = 1
            } else {
                map[char] = count + 1
            }
        }

        for (char in ransomNote) {
            val count = map[char]
            if (count == null) {
                output = false
                break
            } else if (count > 1) {
                map[char] = count - 1
            } else {
                map.remove(char)
            }
        }

        return output
    }
}