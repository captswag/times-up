package refresh._557

class Solution {

    fun reverseWords(s: String): String {
        val a = s.toCharArray()
        var i = 0

        while (i < a.size) {
            var k = i + 1
            while (k < a.size && a[k] != ' ') {
                k++
            }

            var j = k - 1
            while (i < j) {
                val temp = a[i]
                a[i] = a[j]
                a[j] = temp
                i++
                j--
            }

            i = k + 1
        }

        return String(a)
    }
}