package leetcode._2864

class Solution {

    fun maximumOddBinaryNumber(s: String): String {
        var i = 0
        val a = s.toCharArray()

        if (a[a.size - 1] == '0') {
            while (i < a.size && a[i] == '0') {
                i++
            }
            a[i] = '0'
            a[a.size - 1] = '1'
            i++
        }

        var w = 0
        while (i < a.size - 1) {
            if (a[i] == '1') {
                val temp = a[i]
                a[i] = a[w]
                a[w] = temp
                w++
            }
            i++
        }

        return String(a)
    }
}