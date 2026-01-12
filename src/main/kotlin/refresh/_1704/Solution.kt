package refresh._1704

class Solution {

    fun halvesAreAlike(s: String): Boolean {
        val mid = s.length / 2
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var aVowelsCount = 0
        var bVowelsCount = 0

        for (i in 0 until mid) {
            if (s[i] in vowels) {
                aVowelsCount++
            }
            if (s[i + mid] in vowels) {
                bVowelsCount++
            }
        }

        return aVowelsCount == bVowelsCount
    }
}