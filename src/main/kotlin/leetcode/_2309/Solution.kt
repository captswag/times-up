package leetcode._2309

class Solution {
    fun greatestLetter(s: String): String {
        val countArray = IntArray(26)

        for (c in s) {
            if (c.isUpperCase()) {
                if (countArray[c - 'A'] == 0) {
                    countArray[c - 'A'] = 1
                } else if (countArray[c - 'A'] == 2) {
                    countArray[c - 'A'] = 3
                }
            } else {
                // Lowercase
                if (countArray[c - 'a'] == 0) {
                    countArray[c - 'a'] = 2
                } else if (countArray[c - 'a'] == 1) {
                    countArray[c - 'a'] = 3
                }
            }
        }

        var output = ""
        for (index in countArray.size - 1 downTo 0) {
            if (countArray[index] == 3) {
                output = "${(index + 65).toChar()}"
                break
            }
        }

        return output
    }
}