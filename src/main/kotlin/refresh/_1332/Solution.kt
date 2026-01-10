package refresh._1332

class Solution {

    fun removePalindromeSub(s: String): Int {
        var isPalindrome = true
        var low = 0
        var high = s.length - 1

        while (low < high) {
            if (s[low] == s[high]) {
                low++
                high--
            } else {
                isPalindrome = false
                break
            }
        }

        return if (isPalindrome) {
            1
        } else {
            2
        }
    }
}