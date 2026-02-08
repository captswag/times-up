package refresh._3206

class Solution {

    fun numberOfAlternatingGroups(colors: IntArray): Int {
        var cnt = 0

        for (i in colors.indices) {
            if ((colors[i] == 0 && colors[(i + 1) % colors.size] == 1 && colors[(i + 2) % colors.size] == 0) || (colors[i] == 1 && colors[(i + 1) % colors.size] == 0 && colors[(i + 2) % colors.size] == 1)) {
                cnt++
            }
        }

        return cnt
    }
}