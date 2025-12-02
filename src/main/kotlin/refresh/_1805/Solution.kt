package refresh._1805

class Solution {

    fun numDifferentIntegers(word: String): Int {
        var index = 0
        val set = mutableSetOf<String>()

        while (index < word.length) {
            if (word[index] in '0'..'9') {
                val curr = StringBuilder()
                while (index < word.length && word[index] == '0') {
                    index++
                }
                while (index < word.length && word[index] in '0'..'9') {
                    curr.append(word[index])
                    index++
                }
                set.add(curr.toString())
            } else {
                index++
            }
        }

        return set.size
    }
}