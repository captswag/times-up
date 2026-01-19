package refresh._2103

class Solution {

    fun countPoints(rings: String): Int {
        val red = IntArray(10)
        val green = IntArray(10)
        val blue = IntArray(10)

        for (i in rings.indices step 2) {
            when (rings[i]) {
                'R' -> {
                    red[rings[i + 1] - '0']++
                }
                'G' -> {
                    green[rings[i + 1] - '0']++
                }
                'B' -> {
                    blue[rings[i + 1] - '0']++
                }
            }
        }

        var count = 0
        for (i in red.indices) {
            if (red[i] > 0 && green[i] > 0 && blue[i] > 0) {
                count++
            }
        }

        return count
    }
}