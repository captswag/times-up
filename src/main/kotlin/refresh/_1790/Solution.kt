package refresh._1790

class Solution {

    fun areAlmostEqual(s1: String, s2: String): Boolean {
        var numDiffs = 0
        var firstIndexDiff = -1
        var secondIndexDiff = -1

        for (i in s1.indices) {
            if (s1[i] != s2[i]) {
                numDiffs++
                if (numDiffs == 1) {
                    firstIndexDiff = i
                } else {
                    secondIndexDiff = i
                }
            }
        }

        return numDiffs == 0 || (numDiffs == 2 && (s1[firstIndexDiff] == s2[secondIndexDiff] && s1[secondIndexDiff] == s2[firstIndexDiff]))
    }
}