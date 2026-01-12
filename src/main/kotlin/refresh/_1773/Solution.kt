package refresh._1773

class Solution {

    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        val ruleIndex = when {
            areEqual(ruleKey, "type") -> 0
            areEqual(ruleKey, "color") -> 1
            else -> 2
        }

        var count = 0
        for (item in items) {
            if (areEqual(item[ruleIndex], ruleValue)) {
                count++
            }
        }

        return count
    }

    private fun areEqual(item1: String, item2: String): Boolean {
        var i = 0
        var j = 0

        while (i < item1.length && j < item2.length) {
            if (item1[i] != item2[j]) {
                return false
            }
            i++
            j++
        }

        return i == item1.length && j == item2.length
    }
}