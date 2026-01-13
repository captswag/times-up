package refresh._1832

class Solution {

    fun checkIfPangram(sentence: String): Boolean {
        val present = BooleanArray(26)
        var count = 0

        for (c in sentence) {
            if (!present[c - 'a']) {
                present[c - 'a'] = true
                count++
            }
        }

        return count == 26
    }
}