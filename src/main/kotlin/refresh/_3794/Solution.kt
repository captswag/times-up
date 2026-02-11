package refresh._3794

class Solution {

    fun reversePrefix(s: String, k: Int): String {
        var l = 0
        var r = k - 1
        val a = s.toCharArray()

        while (l < r) {
            val temp = a[l]
            a[l] = a[r]
            a[r] = temp
            l++
            r--
        }

        return String(a)
    }
}