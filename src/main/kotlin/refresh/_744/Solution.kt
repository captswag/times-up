package refresh._744

class Solution {

    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var l = 0
        var r = letters.size - 1
        var ans = letters[0]

        while (l <= r) {
            val m = (l + r) ushr 1
            if (letters[m] <= target) {
                l = m + 1
            } else {
                ans = letters[m]
                r = m - 1
            }
        }

        return ans
    }
}