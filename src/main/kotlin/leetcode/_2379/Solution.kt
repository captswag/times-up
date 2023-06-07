package leetcode._2379

class Solution {

    fun minimumRecolors(blocks: String, k: Int): Int {
        var min = countW(blocks, 0, k)
        var currWCount = min

        for (index in k until blocks.length) {
            val prev = blocks[index - k]
            val curr = blocks[index]
            if (prev == 'W') {
                currWCount--
            }
            if (curr == 'W') {
                currWCount++
            }
            min = Math.min(min, currWCount)
        }

        return min
    }

    private fun countW(word: String, start: Int, end: Int): Int {
        var countW = 0
        for (index in start until end) {
            if (word[index] == 'W') {
                countW++
            }
        }
        return countW
    }
}