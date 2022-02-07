package leetcode._1108

class Solution {
    fun defangIPaddr(address: String): String {
        val output = StringBuilder()

        for (c in address) {
            if (c == '.') {
                output.append("[.]")
            } else {
                output.append(c)
            }
        }

        return output.toString()
    }
}