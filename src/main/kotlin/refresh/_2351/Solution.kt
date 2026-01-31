package refresh._2351

class Solution {

    fun repeatedCharacter(s: String): Char {
        val seen = BooleanArray(26)

        for (c in s) {
            if (seen[c - 'a']) {
                return c
            } else {
                seen[c - 'a'] = true
            }
        }

        return ' '
    }
}