package leetcode._1576

class Solution {
    fun modifyString(s: String): String {
        val output = s.toCharArray()

        for (index in output.indices) {
            if (output[index] == '?') {
                for (j in 0..2) {
                    if (!(index - 1 > -1 && output[index - 1] - 'a' == j)) {
                        if (!(index + 1 < output.size && output[index + 1] - 'a' == j)) {
                            output[index] = 'a' + j
                            break
                        }
                    }
                }
            }
        }

        return String(output)
    }
}