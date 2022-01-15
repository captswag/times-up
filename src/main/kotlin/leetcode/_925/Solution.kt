package leetcode._925

class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        var nameIndex = 0
        var typedIndex = 0
        var cCurrent: Char?
        var cPrevious: Char?
        var output = true

        while (typedIndex < typed.length) {
            val pair = findPossibleCharacters(nameIndex, name)
            cCurrent = pair.first
            cPrevious = pair.second

            if (typed[typedIndex] == cCurrent) {
                nameIndex++
                typedIndex++
            } else if (typed[typedIndex] == cPrevious) {
                typedIndex++
            } else {
                output = false
                break
            }
        }

        if (nameIndex < name.length) {
            output = false
        }

        return output
    }

    // First is cCurrent and the second is cPrevious
    private fun findPossibleCharacters(index: Int, name: String): Pair<Char, Char?> {
        return if (index == 0) {
            name[index] to null
        } else if (index >= name.length) {
            name[name.length - 1] to null
        } else {
            name[index] to name[index - 1]
        }
    }
}