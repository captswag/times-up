package refresh._1974

class Solution {

    fun minTimeToType(word: String): Int {
        var time = 0
        var pointer = 'a'

        for (c in word) {
            val timeToType = Math.abs(c - pointer)
            time += Math.min(timeToType, 26 - timeToType)
            pointer = c
        }

        return time + word.length
    }
}