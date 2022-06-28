package leetcode._1271

class Solution {
    fun toHexspeak(num: String): String {
        val map = mapOf(0L to 'O', 1L to 'I', 10L to 'A', 11L to 'B', 12L to 'C', 13L to 'D', 14L to 'E', 15L to 'F')
        var number = num.toLong()
        val output = StringBuilder()

        while (number != 0L) {
            val mod = number % 16
            if (mod in 2..9) {
                output.clear()
                output.append("ERROR")
                break
            } else {
                val charRepresentation = map[mod]
                if (charRepresentation != null) {
                    output.insert(0, charRepresentation)
                }
            }
            number /= 16
        }

        return String(output)
    }
}