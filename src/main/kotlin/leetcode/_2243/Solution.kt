package leetcode._2243

class Solution {
    fun digitSum(s: String, k: Int): String {
        val output = StringBuilder(s)

        while (output.length > k) {
            var count = 0
            var currentSum = 0
            var index = 0
            val current = StringBuilder()

            while (index < output.length) {
                if (count + 1 == k || index == output.length - 1) {
                    currentSum += Character.getNumericValue(output[index])
                    current.append(currentSum)
                    currentSum = 0
                    count = 0
                } else {
                    currentSum += Character.getNumericValue(output[index])
                    count++
                }
                index++
            }
            output.clear()
            output.append(current)
        }

        return String(output)
    }
}