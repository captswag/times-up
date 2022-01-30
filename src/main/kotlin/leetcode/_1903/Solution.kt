package leetcode._1903

class Solution {
    fun largestOddNumber(num: String): String {
        val sb = StringBuilder()

        for (index in num.length - 1 downTo 0) {
            if (sb.isNotEmpty()) {
                sb.insert(0, num[index])
            } else if (isOdd(num[index])) {
                sb.append(num[index])
            }
        }

        return sb.toString()
    }

    private fun isOdd(character: Char) = Character.getNumericValue(character) % 2 == 1
}