package refresh._3146

class Solution {

    fun findPermutationDifference(s: String, t: String): Int {
        val indexArray = IntArray(26)

        for (index in t.indices) {
            indexArray[t[index] - 'a'] = index
        }

        var sum = 0
        for (index in s.indices) {
            sum += Math.abs(index - indexArray[s[index] - 'a'])
        }

        return sum
    }
}