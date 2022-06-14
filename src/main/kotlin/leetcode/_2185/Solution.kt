package leetcode._2185

class Solution {
    fun prefixCount(words: Array<String>, pref: String): Int {
        var output = 0
        for (word in words) {
            var prefIndex = 0
            var isPrefix = false

            for (c in word) {
                if (c == pref[prefIndex]) {
                    if (prefIndex == pref.length - 1) {
                        isPrefix = true
                        break
                    } else {
                        prefIndex++
                    }
                } else {
                    break
                }
            }

            if (isPrefix) {
                output++
            }
        }

        return output
    }
}