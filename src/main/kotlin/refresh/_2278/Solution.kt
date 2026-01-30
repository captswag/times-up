package refresh._2278

class Solution {

    fun percentageLetter(s: String, letter: Char): Int {
        var count = 0

        for (c in s) {
            if (c == letter) {
                count++
            }
        }

        return (count * 100) / s.length
    }
}