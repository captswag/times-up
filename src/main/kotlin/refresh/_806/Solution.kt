package refresh._806

class Solution {

    fun numberOfLines(widths: IntArray, s: String): IntArray {
        var lines = 1
        var currPixels = 0

        for (c in s) {
            currPixels += widths[c - 'a']
            if (currPixels > 100) {
                lines++
                currPixels = widths[c - 'a']
            }
        }

        return intArrayOf(lines, currPixels)
    }
}