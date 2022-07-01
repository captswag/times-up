package leetcode._1496

class Solution {
    fun isPathCrossing(path: String): Boolean {
        var output = false
        val set = mutableSetOf<String>()
        var x = 0
        var y = 0
        set.add(combineCoordinates(x, y))

        for (direction in path) {
            when (direction) {
                'N' -> {
                    x++
                }
                'S' -> {
                    x--
                }
                'E' -> {
                    y++
                }
                'W' -> {
                    y--
                }
            }
            if (!set.add(combineCoordinates(x, y))) {
                output = true
                break
            }
        }

        return output
    }

    private fun combineCoordinates(x: Int, y: Int): String {
        return "$x.$y"
    }
}