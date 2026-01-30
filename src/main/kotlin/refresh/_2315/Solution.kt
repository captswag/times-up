package refresh._2315

class Solution {

    fun countAsterisks(s: String): Int {
        var bars = 0
        var asterisks = 0

        for (c in s) {
            if (c == '|') {
                bars++
            } else if (c == '*' && bars and 1 == 0) {
                asterisks++
            }
        }

        return asterisks
    }
}