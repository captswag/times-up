package leetcode._657

class Solution {
    fun judgeCircle(moves: String): Boolean {
        var x = 0
        var y = 0

        for (move in moves) {
            when (move) {
                'U' -> {
                    y++
                }
                'D' -> {
                    y--
                }
                'R' -> {
                    x++
                }
                'L' -> {
                    x--
                }
            }
        }

        return (x == 0 && y == 0)
    }
}