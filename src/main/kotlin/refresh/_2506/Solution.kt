package refresh._2506

class Solution {

    fun similarPairs(words: Array<String>): Int {
        var cnt = 0

        for (i in words.indices) {
            val seen1 = BooleanArray(26)
            for (c in words[i]) {
                seen1[c - 'a'] = true
            }

            for (j in i + 1 until words.size) {
                val seen2 = BooleanArray(26)
                for (c in words[j]) {
                    seen2[c - 'a'] = true
                }

                for (k in seen1.indices) {
                    if (seen1[k] == seen2[k]) {
                        if (k == 25) {
                            cnt++
                        }
                    } else {
                        break
                    }
                }
            }
        }

        return cnt
    }
}