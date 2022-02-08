package leetcode._1773

class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var output = 0

        for (item in items) {
            if (ruleKey == "type") {
                if (item[0] == ruleValue) {
                    output++
                }
            } else if (ruleKey == "color") {
                if (item[1] == ruleValue) {
                    output++
                }
            } else { // ruleKey == "name"
                if (item[2] == ruleValue) {
                    output++
                }
            }
        }

        return output
    }
}