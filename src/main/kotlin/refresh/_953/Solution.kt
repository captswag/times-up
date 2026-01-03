package refresh._953

class Solution {

    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val indexArray = IntArray(26)

        for (index in order.indices) {
            indexArray[order[index] - 'a'] = index
        }

        for (i in 0 until words.size - 1) {
            for (j in words[i].indices) {
                if (j >= words[i + 1].length) {
                    return false
                }

                if (indexArray[words[i][j] - 'a'] < indexArray[words[i + 1][j] - 'a']) {
                    break
                } else if (indexArray[words[i][j] - 'a'] > indexArray[words[i + 1][j] - 'a']) {
                    return false
                }
            }
        }

        return true
    }
}