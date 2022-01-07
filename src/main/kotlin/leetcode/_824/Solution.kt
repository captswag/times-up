package leetcode._824

class Solution {

    private val set = hashSetOf<Char>('a', 'e', 'i', 'o', 'u')

    fun toGoatLatin(sentence: String): String {
        val sb = StringBuilder()

        var sIndex = 0
        var eIndex = 0
        var count = 1 // To count the index of the word so that we can append 'a' at the end

        while (eIndex <= sentence.length) {
            if (eIndex == sentence.length || sentence[eIndex] == ' ') {
                // We either found a word or we readed the end of the sentence
                if (set.contains(sentence[sIndex].toLowerCase())) {
                    // The word starts with a vowel
                    fillUp(sb, sentence, sIndex, eIndex - 1)
                    sb.append("ma")
                    appendA(sb, count, eIndex == sentence.length)
                    sIndex = eIndex + 1
                } else {
                    // The word starts with a consonant
                    fillUp(sb, sentence, sIndex + 1, eIndex - 1)
                    sb.append(sentence[sIndex])
                    sb.append("ma")
                    appendA(sb, count, eIndex == sentence.length)
                    sIndex = eIndex + 1
                }
                count++
            }
            eIndex++
        }

        return sb.toString()
    }

    private fun fillUp(sb: StringBuilder, sentence: String, sIndex: Int, eIndex: Int) {
        var startIndex = sIndex
        while (startIndex <= eIndex) {
            sb.append(sentence[startIndex])
            startIndex++
        }
    }

    private fun appendA(sb: StringBuilder, count: Int, lastWord: Boolean) {
        for (index in 0 until count) {
            sb.append('a')
        }
        if (!lastWord) {
            sb.append(" ")
        }
    }
}