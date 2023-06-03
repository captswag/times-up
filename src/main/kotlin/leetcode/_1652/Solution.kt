package leetcode._1652

class Solution {

    fun decrypt(code: IntArray, k: Int): IntArray {
        var start: Int
        var end: Int
        if (k < 0) {
            start = code.size + k - 1
            end = code.size - 1
        } else {
            start = 0
            end = k
        }

        var sum = 0
        for (index in start until end) {
            sum += code[index]
        }

        val output = IntArray(code.size)
        for (index in output.indices) {
            sum = sum - code[start] + code[end]
            output[index] = sum
            start = (start + 1) % code.size
            end = (end + 1) % code.size
        }
        return output
    }
}