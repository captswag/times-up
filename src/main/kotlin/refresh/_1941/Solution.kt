package refresh._1941

class Solution {

    fun areOccurrencesEqual(s: String): Boolean {
        val frequency = IntArray(26)

        for (c in s) {
            frequency[c - 'a']++
        }

        val expectedFrequency = frequency[s[0] - 'a']

        for (f in frequency) {
            if (f != 0 && f != expectedFrequency) {
                return false
            }
        }

        return true
    }
}