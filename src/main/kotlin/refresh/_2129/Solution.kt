package refresh._2129

class Solution {

    fun capitalizeTitle(title: String): String {
        val c = title.toCharArray()

        for (i in c.indices) {
            if (i == 0 || c[i - 1] == ' ') {
                if (i + 2 >= c.size || (i + 2 < c.size && (c[i + 1] == ' ' || c[i + 2] == ' '))) {
                    c[i] = c[i].lowercaseChar()
                } else {
                    c[i] = c[i].uppercaseChar()
                }
            } else {
                c[i] = c[i].lowercaseChar()
            }
        }

        return String(c)
    }
}