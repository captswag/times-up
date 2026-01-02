package refresh._844

class Solution {

    fun backspaceCompare(s: String, t: String): Boolean {
        val sbs = StringBuilder()
        val sbt = StringBuilder()

        for (c in s) {
            if (c == '#') {
                if (sbs.isNotEmpty()) {
                    sbs.setLength(sbs.length - 1)
                }
            } else {
                sbs.append(c)
            }
        }

        for (c in t) {
            if (c == '#') {
                if (sbt.isNotEmpty()) {
                    sbt.setLength(sbt.length - 1)
                }
            } else {
                sbt.append(c)
            }
        }

        return sbs.toString() == sbt.toString()
    }
}