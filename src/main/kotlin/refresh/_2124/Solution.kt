package refresh._2124

class Solution {

    fun checkString(s: String): Boolean {
        var bFound = false

        for (c in s) {
            if (c == 'a') {
                if (bFound) {
                    return false
                }
            } else {
                bFound = true
            }
        }

        return true
    }
}