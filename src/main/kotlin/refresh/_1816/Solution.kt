package refresh._1816

class Solution {

    fun truncateSentence(s: String, k: Int): String {
        var kCount = 0
        var sIndex = 0
        val sb = StringBuilder()

        while (kCount < k) {
            while (sIndex < s.length && s[sIndex] != ' ') {
                sb.append(s[sIndex++])
            }
            kCount++
            if (kCount != k) {
                sb.append(s[sIndex++])
            }
        }

        return sb.toString()
    }
}