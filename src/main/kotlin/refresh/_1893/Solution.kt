package refresh._1893

class Solution {

    fun isCovered(ranges: Array<IntArray>, left: Int, right: Int): Boolean {
        val line = IntArray(52)

        for (range in ranges) {
            line[range[0]]++
            line[range[1] + 1]--
        }

        var overlap = 0
        for (value in 1..right) {
            overlap += line[value]
            if (value >= left && overlap <= 0) {
                return false
            }
        }

        return true
    }
}