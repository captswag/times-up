package refresh._345

class Solution {

    fun reverseVowels(s: String): String {
        val a = s.toCharArray()
        var l = 0
        var r = a.size - 1

        while (l < r) {
            if (isVowel(a[l]) && isVowel(a[r])) {
                val temp = a[l]
                a[l] = a[r]
                a[r] = temp
                l++
                r--
            } else {
                if (!isVowel(s[l])) {
                    l++
                }
                if (!isVowel(s[r])) {
                    r--
                }
            }
        }

        return String(a)
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
    }
}