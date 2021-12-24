package leetcode._67

class Solution {
    fun addBinary(a: String, b: String): String {
        var output = ""
        // Both are having a size greater than or equal to 1 and the values are '0' and '1'
        var aIndex = a.length - 1
        var bIndex = b.length - 1
        var carryForward = 0

        while (aIndex >= 0 || bIndex >= 0) {
            val aInt = if (aIndex >= 0) {
                Character.getNumericValue(a[aIndex])
            } else 0
            val bInt = if (bIndex >= 0) {
                Character.getNumericValue(b[bIndex])
            } else 0

            when (aInt + bInt + carryForward) {
                0 -> {
                    output = "0$output"
                    carryForward = 0
                }
                1 -> {
                    output = "1$output"
                    carryForward = 0
                }
                2 -> {
                    output = "0$output"
                    carryForward = 1
                }
                3 -> {
                    output = "1$output"
                    carryForward = 1
                }
            }

            aIndex--
            bIndex--
        }

        if (carryForward == 1) {
            output = "1$output"
        }
        return output
    }
}