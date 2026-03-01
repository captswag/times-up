package refresh._2085

class Solution {

    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        val freq1 = mutableMapOf<String, Int>()
        for (w in words1) {
            freq1[w] = freq1.getOrDefault(w, 0) + 1
        }

        val freq2 = mutableMapOf<String, Int>()
        for (w in words2) {
            freq2[w] = freq2.getOrDefault(w, 0) + 1
        }

        var cnt = 0
        for (k in freq1.keys) {
            if (freq1.getValue(k) == 1 && freq2.containsKey(k) && freq2.getValue(k) == 1) {
                cnt++
            }
        }

        return cnt
    }
}