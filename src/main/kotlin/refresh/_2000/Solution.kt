package refresh._2000

class Solution {

    fun reversePrefix(word: String, ch: Char): String {
        var i = 0

        while (i < word.length) {
            if (word[i] == ch) {
                break
            }
            i++
        }

        return if (i == word.length) {
            word
        } else {
            val c = word.toCharArray()
            var low = 0
            var high = i
            while (low < high) {
                val temp = c[low]
                c[low] = c[high]
                c[high] = temp
                low++
                high--
            }

            return String(c)
        }
    }
}