package refresh._2586

class Solution {

    fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
        var cnt = 0

        for (i in left..right) {
            if (isVowel(words[i][0]) && isVowel(words[i][words[i].length - 1])) {
                cnt++
            }
        }

        return cnt
    }

    private fun isVowel(c: Char): Boolean {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
    }
}