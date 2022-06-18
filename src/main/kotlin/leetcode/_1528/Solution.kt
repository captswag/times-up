package leetcode._1528

class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        val map = mutableMapOf<Int, Char>()
        var index = 0
        var max = -1

        while (index < indices.size) {
            map[indices[index]] = s[index]
            if (indices[index] > max) {
                max = indices[index]
            }
            index++
        }

        val output = CharArray(max + 1)
        index = 0
        while (index < output.size) {
            output[index] = map[index] ?: ' '
            index++
        }

        return String(output)
    }
}