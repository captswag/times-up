package refresh._557

class Solution {

    fun reverseWords(s: String): String {
        var i = 0
        val a = s.toCharArray()

        while (i < a.size) {
            var l = i
            while (i < a.size && a[i] != ' ') {
                i++
            }

            var r = i - 1
            while (l < r) {
                val tmp = a[l]
                a[l] = a[r]
                a[r] = tmp
                l++
                r--
            }

            i++
        }

        return String(a)
    }
}