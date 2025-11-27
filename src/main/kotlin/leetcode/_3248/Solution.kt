package leetcode._3248

class Solution {

    fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
        var row = 0
        var column = 0

        for (command in commands) {
            when (command) {
                "LEFT" -> column--
                "UP" -> row--
                "RIGHT" -> column++
                "DOWN" -> row++
            }
        }

        return (row * n) + column
    }
}