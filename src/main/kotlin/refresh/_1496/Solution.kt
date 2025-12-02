package refresh._1496

class Solution {

    fun isPathCrossing(path: String): Boolean {
        var x = 0
        var y = 0
        val set = mutableSetOf<String>()
        set.add("$x-$y")

        for (p in path) {
            when (p) {
                'N' -> y++
                'S' -> y--
                'E' -> x++
                'W' -> x--
            }
            val join = "$x-$y"
            if (set.contains(join)) {
                return true
            } else {
                set.add(join)
            }
        }

        return false
    }
}