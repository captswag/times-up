package leetcode._1720

class Solution {
    fun decode(encoded: IntArray, first: Int): IntArray {
        val output = IntArray(encoded.size + 1)
        var index = 0
        output[index] = first

        while (index < encoded.size) {
            output[index + 1] = output[index] xor encoded[index]
            index++
        }

        return output
    }
}