package leetcode._1374

class Solution {
    fun generateTheString(n: Int): String {
        val output = CharArray(n)

        if (n % 2 == 0) {
            output[n - 1] = 'z'
        }

        for (index in 0 until n) {
            if (output[index] == 'z') {
                break
            } else {
                output[index] = 'p'
            }
        }

        return String(output)
    }
}