package refresh._1903

class Solution {

    fun largestOddNumber(num: String): String {
        var i = num.length - 1

        while (i > -1) {
            if ((num[i] - '0') and 1 == 1) {
                break
            }
            i--
        }

        val c = CharArray(i + 1)
        for (j in 0 until i + 1) {
            c[j] = num[j]
        }

        return String(c)
    }
}