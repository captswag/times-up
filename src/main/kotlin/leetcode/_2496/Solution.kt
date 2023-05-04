package leetcode._2496

class Solution {

    fun maximumValue(strs: Array<String>): Int {
        var output = 0

        for (str in strs) {
            var number = 0
            for (index in str.indices) {
                if (str[index].isLetter()) {
                    if (str.length > output) {
                        output = str.length
                    }
                    break
                } else {
                    number = (number * 10) + Character.getNumericValue(str[index])
                    if (index == str.length - 1 && number > output) {
                        output = number
                    }
                }
            }
        }

        return output
    }
}