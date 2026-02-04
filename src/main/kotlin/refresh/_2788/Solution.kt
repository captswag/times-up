package refresh._2788

class Solution {

    fun splitWordsBySeparator(words: List<String>, separator: Char): List<String> {
        val ans = mutableListOf<String>()
        val sb = StringBuilder()

        for (word in words) {
            var i = 0
            while (i < word.length) {
                while (i < word.length && word[i] != separator) {
                    sb.append(word[i++])
                }

                if (sb.isNotEmpty()) {
                    ans.add(sb.toString())
                    sb.setLength(0)
                }

                i++
            }
        }

        return ans
    }
}