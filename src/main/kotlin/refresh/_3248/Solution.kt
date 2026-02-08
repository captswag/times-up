package refresh._3248

class Solution {

    fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
        var i = 0
        var j = 0

        for (command in commands) {
            when (command) {
                "UP" -> i--
                "RIGHT" -> j++
                "DOWN" -> i++
                "LEFT" -> j--
            }
        }

        return (i * n) + j
    }
}