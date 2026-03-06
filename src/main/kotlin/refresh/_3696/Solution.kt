package refresh._3696

import kotlin.math.max

class Solution {

    fun maxDistance(words: Array<String>): Int {
        var mx = 0

        for (i in words.indices) {
            if (words[i] != words[0]) {
                mx = max(mx, i + 1)
            }

            if (words[i] != words[words.size - 1]) {
                mx = max(mx, words.size - i)
            }
        }

        return mx
    }
}