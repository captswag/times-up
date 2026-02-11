package refresh._3823

class Solution {

    fun reverseByType(s: String): String {
        val a = s.toCharArray()

        var l = 0
        var r = a.size - 1

        while (l < r) {
            if (a[l].isLetter() && a[r].isLetter()) {
                val temp = a[l]
                a[l] = a[r]
                a[r] = temp
                l++
                r--
            } else if (a[l].isLetter()) {
                r--
            } else if (a[r].isLetter()) {
                l++
            } else {
                l++
                r--
            }
        }

        l = 0
        r = a.size - 1

        while (l < r) {
            if (!a[l].isLetter() && !a[r].isLetter()) {
                val temp = a[l]
                a[l] = a[r]
                a[r] = temp
                l++
                r--
            } else if (a[l].isLetter()) {
                l++
            } else if (a[r].isLetter()) {
                r--
            } else {
                l++
                r--
            }
        }

        return String(a)
    }
}