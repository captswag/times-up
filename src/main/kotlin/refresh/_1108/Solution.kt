package refresh._1108

class Solution {

    fun defangIPaddr(address: String): String {
        val result = CharArray(address.length + 6)
        var resultIndex = 0

        for (c in address) {
            if (c == '.') {
                result[resultIndex++] = '['
                result[resultIndex++] = '.'
                result[resultIndex++] = ']'
            } else {
                result[resultIndex++] = c
            }
        }

        return String(result)
    }
}