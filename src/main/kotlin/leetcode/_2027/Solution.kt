package leetcode._2027

class Solution {

    fun minimumMoves(s: String): Int {
        var i = 0
        var moves = 0

        while (i < s.length) {
            if (s[i] == 'X') {
                i += 3
                moves++
            } else {
                i++
            }
        }

        return moves
    }
}