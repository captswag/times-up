package leetcode._1486

class Solution {
    fun xorOperation(n: Int, start: Int): Int {
        var output = 0

        for (index in 0 until n) {
            val number = start + (2 * index)
            output = output.xor(number)
        }

        return output
    }
}