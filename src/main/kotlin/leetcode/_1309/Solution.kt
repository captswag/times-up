package leetcode._1309

class Solution {
    fun freqAlphabets(s: String): String {
        var index = 0
        val output = StringBuilder()

        while (index < s.length) {
            if (index + 2 < s.length) {
                val c1 = s[index]
                val c2 = s[index + 1]
                val c3 = s[index + 2]

                val c1NumericValue = Character.getNumericValue(c1)
                val c2NumericValue = Character.getNumericValue(c2)
                val cNumericValue = c1NumericValue * 10 + c2NumericValue
                if (cNumericValue <= 26 && c3 == '#') {
                    output.append(getOneToNineMapping(cNumericValue))
                    index += 3
                } else {
                    output.append(getOneToNineMapping(c1NumericValue))
                    index++
                }
            } else {
                output.append(getOneToNineMapping(Character.getNumericValue(s[index])))
                index++
            }
        }

        return String(output)
    }

    private fun getOneToNineMapping(cNumericValue: Int): Char = (cNumericValue + 96).toChar()
}