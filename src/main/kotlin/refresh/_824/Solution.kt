package refresh._824

class Solution {

    fun toGoatLatin(sentence: String): String {
        val res = StringBuilder()
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        var aCount = 1
        var firstCharIndex: Int
        var i = 0
        while (i < sentence.length) {
            if (i != 0) {
                res.append(' ')
            }
            firstCharIndex = i
            if (sentence[i] in vowels) {
                res.append(sentence[i])
            }
            i++
            while (i < sentence.length && sentence[i].isLetter()) {
                res.append(sentence[i])
                i++
            }
            if (sentence[firstCharIndex] !in vowels) {
                res.append(sentence[firstCharIndex])
            }
            res.append("ma")
            for (count in 0 until aCount) {
                res.append('a')
            }
            aCount++
            i++
        }

        return res.toString()
    }
}