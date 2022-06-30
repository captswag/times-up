package leetcode._1736

class Solution {
    fun maximumTime(time: String): String {
        val output = time.toCharArray()
        if (output[0] == '?') {
            if (output[1] == '?') {
                output[0] = '2'
            } else {
                if (Character.getNumericValue(output[1]) < 4) {
                    output[0] = '2'
                } else {
                    output[0] = '1'
                }
            }
        }
        if (output[1] == '?') {
            if (output[0] == '2') {
                output[1] = '3'
            } else {
                output[1] = '9'
            }
        }
        if (output[3] == '?') {
            output[3] = '5'
        }
        if (output[4] == '?') {
            output[4] = '9'
        }

        return String(output)
    }
}