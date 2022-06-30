package leetcode._2299

class Solution {
    fun strongPasswordCheckerII(password: String): Boolean {
        var hasLowerCase = false
        var hasUpperCase = false
        var hasDigit = false
        var hasSpecialCharacters = false
        var sameAdjacentCharacters = false

        val set = setOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+')

        for (index in password.indices) {
            if (index != 0 && password[index] == password[index - 1]) {
                sameAdjacentCharacters = true
                break
            }
            if (password[index].isDigit()) {
                hasDigit = true
            } else if (password[index] in set) {
                hasSpecialCharacters = true
            } else if (password[index].isUpperCase()) {
                hasUpperCase = true
            } else if (password[index].isLowerCase()) {
                hasLowerCase = true
            }
        }

        return hasLowerCase && hasUpperCase && hasDigit && hasSpecialCharacters && !sameAdjacentCharacters && password.length >= 8
    }
}