package refresh._2000

class Solution {

    fun reversePrefix(word: String, ch: Char): String {
        var r = 0
        while (r < word.length && word[r] != ch) {
            r++
        }

        return if (r == word.length) {
            word
        } else {
            val a = word.toCharArray()
            var l = 0

            while (l < r) {
                val tmp = a[l]
                a[l] = a[r]
                a[r] = tmp
                l++
                r--
            }

            String(a)
        }
    }
}