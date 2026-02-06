package refresh._3114

class Solution {

    fun findLatestTime(s: String): String {
        val a = s.toCharArray()

        if (a[0] == '?') {
            if (a[1] == '?' || a[1] - '0' < 2) {
                a[0] = '1'
            } else {
                a[0] = '0'
            }
        }

        if (a[1] == '?') {
            if (a[0] == '0') {
                a[1] = '9'
            } else {
                a[1] = '1'
            }
        }

        if (a[3] == '?') {
            a[3] = '5'
        }

        if (a[4] == '?') {
            a[4] = '9'
        }

        return String(a)
    }
}