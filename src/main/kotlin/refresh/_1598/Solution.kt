package refresh._1598

class Solution {

    fun minOperations(logs: Array<String>): Int {
        var depth = 0

        for (log in logs) {
            when (log) {
                "../" -> if (depth > 0) {
                    depth--
                }
                "./" -> {

                }
                else -> {
                    depth++
                }
            }
        }

        return depth
    }
}