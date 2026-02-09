package refresh._3461

class Solution {

    fun hasSameDigits(s: String): Boolean {
        val a = s.toCharArray()
        var size = a.size

        while (size > 2) {
            for (i in 0 until size - 1) {
                a[i] = (((a[i] - '0') + (a[i + 1] - '0')) % 10).digitToChar()
            }
            size--
        }

        return a[0] == a[1]
    }
}