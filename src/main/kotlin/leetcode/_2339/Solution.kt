package leetcode._2339

class Solution {

    fun checkDistances(s: String, distance: IntArray): Boolean {
        var output = true
        val indexArray = IntArray(26) { -1 }

        for (index in s.indices) {
            val alphabetIndex = s[index] - 'a'
            if (indexArray[alphabetIndex] == -1) {
                indexArray[alphabetIndex] = index
            } else {
                if (index - indexArray[alphabetIndex] - 1 != distance[alphabetIndex]) {
                    output = false
                }
            }
        }

        return output
    }
}