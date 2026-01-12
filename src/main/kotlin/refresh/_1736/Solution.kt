package refresh._1736

class Solution {

    fun maximumTime(time: String): String {
        val c = time.toCharArray()

        if (c[0] == '?') {
            if (c[1] == '?') {
                c[0] = '2'
            } else {
                if (c[1] - '0' > 3) {
                    c[0] = '1'
                } else {
                    c[0] = '2'
                }
            }
        }

        if (c[1] == '?') {
            if (c[0] == '2') {
                c[1] = '3'
            } else {
                c[1] = '9'
            }
        }

        if (c[3] == '?') {
            c[3] = '5'
        }

        if (c[4] == '?') {
            c[4] = '9'
        }

        return String(c)
    }
}