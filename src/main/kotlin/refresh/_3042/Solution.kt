package refresh._3042

class Solution {

    fun countPrefixSuffixPairs(words: Array<String>): Int {
        var ans = 0

        for (i in words.indices) {
            val s = words[i]
            for (j in i + 1 until words.size) {
                val t = words[j]
                var k = 0
                val pos = t.length - s.length

                while (k < s.length && pos + k >= 0) {
                    if (s[k] != t[k] || s[k] != t[pos + k]) {
                        break
                    }
                    k++
                }

                if (k == s.length) {
                    ans++
                }
            }
        }

        return ans
    }
}