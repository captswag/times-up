package leetcode._412

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val fizzList = mutableListOf<String>()

        for (num in 1..n) {
            val divisibleBy3 = num % 3 == 0
            if (num % 5 == 0) {
                if (divisibleBy3) {
                    fizzList.add("FizzBuzz")
                } else {
                    fizzList.add("Buzz")
                }
            } else if (divisibleBy3) {
                fizzList.add("Fizz")
            } else {
                fizzList.add("$num")
            }
        }

        return fizzList
    }
}