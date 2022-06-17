package leetcode._2264

class Solution {
    fun largestGoodInteger(num: String): String {
        var largest = -1
        var output = StringBuilder()
        var index = 0

        while (index + 2 < num.length) {
            val c1 = num[index]
            val c2 = num[index + 1]
            val c3 = num[index + 2]

            if (c1 == c2 && c2 == c3) {
                val c1c2 = (Character.getNumericValue(c1) * 10) + Character.getNumericValue(c2)
                val c1c2c3 = (c1c2 * 10) + Character.getNumericValue(c3)

                if (c1c2c3 > largest) {
                    largest = c1c2c3
                    output.clear()
                    output.append(c1)
                    output.append(c2)
                    output.append(c3)
                }
                index += 3
            } else {
                index++
            }
        }

        return output.toString()
    }
}