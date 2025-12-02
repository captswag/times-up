package refresh._1576

class Solution {

    fun modifyString(s: String): String {
        val charArray = s.toCharArray()

        for (index in charArray.indices) {
            if (charArray[index] == '?') {
                for (char in 0 until 3) {
                    if (index > 0 && charArray[index - 1] - 'a' == char) continue
                    if (index < charArray.size - 1 && charArray[index + 1] - 'a' == char) continue
                    charArray[index] = (char + 97).toChar()
                }
            }
        }

        return String(charArray)
    }
}