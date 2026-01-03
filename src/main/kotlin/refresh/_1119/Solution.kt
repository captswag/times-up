package refresh._1119

class Solution {

    fun removeVowels(s: String): String {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        val res = StringBuilder()

        for (c in s) {
            if (c !in vowels) {
                res.append(c)
            }
        }

        return res.toString()
    }
}