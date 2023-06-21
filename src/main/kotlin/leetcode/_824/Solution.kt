package leetcode._824

class Solution {

    fun toGoatLatin(sentence: String): String {
        val set = mutableSetOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val goatLatin = StringBuilder()
        var start = 0
        var count = 0

        while (start < sentence.length) {
            count++
            val startChar = sentence[start]
            if (startChar in set) {
                goatLatin.append(startChar)
            }

            var end = start + 1
            while (end < sentence.length && sentence[end] != ' ') {
                goatLatin.append(sentence[end++])
            }

            if (startChar !in set) {
                goatLatin.append(startChar)
            }

            goatLatin.append('m')
            goatLatin.append("a".repeat(count + 1))
            if (end < sentence.length) {
                goatLatin.append(' ')
            }

            start = end + 1
        }

        return goatLatin.toString()
    }
}