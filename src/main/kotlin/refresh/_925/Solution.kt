package refresh._925

class Solution {

    fun isLongPressedName(name: String, typed: String): Boolean {
        var nameIndex = 0
        var typedIndex = 0

        while (nameIndex < name.length && typedIndex < typed.length) {
            if (name[nameIndex] == typed[typedIndex]) {
                nameIndex++
                typedIndex++
            } else {
                if (typedIndex > 0 && typed[typedIndex] == typed[typedIndex - 1]) {
                    typedIndex++
                } else {
                    return false
                }
            }
        }

        if (nameIndex == name.length && typedIndex != typed.length) {
            while (typedIndex < typed.length) {
                if (typed[typedIndex] != name[nameIndex - 1]) {
                    return false
                }
                typedIndex++
            }
        }

        return nameIndex == name.length && typedIndex == typed.length
    }
}