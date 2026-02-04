package refresh._2710

class Solution {

    fun removeTrailingZeros(num: String): String {
        val a = num.toCharArray()
        var len = a.size

        while (len > 1 && a[len - 1] == '0') {
            len--
        }

        return String(a, 0, len)
    }
}