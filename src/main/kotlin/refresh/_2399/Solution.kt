package refresh._2399

class Solution {

    fun checkDistances(s: String, distance: IntArray): Boolean {
        val idx = IntArray(26) { -1 }

        for (i in s.indices) {
            if (idx[s[i] - 'a'] == -1) {
                idx[s[i] - 'a'] = i
            } else if (i - idx[s[i] - 'a'] - 1 != distance[s[i] - 'a']) {
                return false
            }
        }

        return true
    }
}