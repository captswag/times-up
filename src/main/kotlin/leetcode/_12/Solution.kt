package leetcode._12

class Solution {
    fun intToRoman(num: Int): String {
        var input = num
        var output = ""
        while (input > 0) {
            when {
                input >= 1000 -> {
                    output += "M"
                    input -= 1000
                }
                input >= 900 -> {
                    output += "CM"
                    input -= 900
                }
                input >= 500 -> {
                    output += "D"
                    input -= 500
                }
                input >= 400 -> {
                    output += "CD"
                    input -= 400
                }
                input >= 100 -> {
                    output += "C"
                    input -= 100
                }
                input >= 90 -> {
                    output += "XC"
                    input -= 90
                }
                input >= 50 -> {
                    output += "L"
                    input -= 50
                }
                input >= 40 -> {
                    output += "XL"
                    input -= 40
                }
                input >= 10 -> {
                    output += "X"
                    input -= 10
                }
                input >= 9 -> {
                    output += "IX"
                    input = 0
                }
                input >= 5 -> {
                    output += "V"
                    input -= 5
                }
                input >= 4 -> {
                    output += "IV"
                    input = 0
                }
                input >= 1 -> {
                    output += "I"
                    input -= 1
                }
            }
        }
        return output
    }
}