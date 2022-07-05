package leetcode._2325

class Solution {
    fun decodeMessage(key: String, message: String): String {
        var charIndex = 'a'
        val charSet = mutableSetOf<Char>()
        val charMap = CharArray(26)

        for (c in key) {
            if (c.isLetter() && c !in charSet) {
                charMap[c - 'a'] = charIndex
                charIndex++
                charSet.add(c)
            }
        }

        val output = CharArray(message.length)
        for (index in message.indices) {
            if (message[index].isLetter()) {
                output[index] = charMap[message[index] - 'a']
            } else {
                output[index] = message[index]
            }
        }

        return String(output)
    }
}