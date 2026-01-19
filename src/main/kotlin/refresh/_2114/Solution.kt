package refresh._2114

import kotlin.math.max

class Solution {

    fun mostWordsFound(sentences: Array<String>): Int {
        var max = 1

        for (sentence in sentences) {
            var count = 0
            for (c in sentence) {
                if (c == ' ') {
                    count++
                }
            }
            max = max(max, count + 1)
        }

        return max
    }
}