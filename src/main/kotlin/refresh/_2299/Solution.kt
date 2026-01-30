package refresh._2299

class Solution {

    fun strongPasswordCheckerII(password: String): Boolean {
        var hasLowercase = false
        var hasUppercase = false
        var hasDigit = false
        var hasSpecialCharacter = false
        val specialCharacterSet = setOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+')

        for (i in password.indices) {
            if (password[i].isLetter()) {
                if (password[i].isLowerCase()) {
                    hasLowercase = true
                } else {
                    hasUppercase = true
                }
            } else if (password[i].isDigit()) {
                hasDigit = true
            } else if (password[i] in specialCharacterSet) {
                hasSpecialCharacter = true
            }
            if (i != password.length - 1) {
                if (password[i] == password[i + 1]) {
                    return false
                }
            }
        }

        return password.length > 7 && hasLowercase && hasUppercase && hasDigit && hasSpecialCharacter
    }
}