package refresh._2114

import kotlin.math.max

class Solution {

    fun mostWordsFound(sentences: Array<String>): Int {
        var mx = 0

        for (s in sentences) {
            var cur = 1
            for (c in s) {
                if (c == ' ') {
                    cur++
                }
            }

            mx = max(mx, cur)
        }

        return mx
    }
}