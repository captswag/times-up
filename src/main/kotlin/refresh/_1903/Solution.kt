package refresh._1903

class Solution {

    fun largestOddNumber(num: String): String {
        var i = num.length - 1

        while (i >= 0 && (num[i] - '0') and 1 == 0) {
            i--
        }

        return num.substring(0, i + 1)
    }
}