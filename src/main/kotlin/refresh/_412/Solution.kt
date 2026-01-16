package refresh._412

class Solution {

    fun fizzBuzz(n: Int): List<String> {
        val res = mutableListOf<String>()

        for (i in 1..n) {
            res.add(
                if (i % 15 == 0) {
                    "FizzBuzz"
                } else if (i % 5 == 0) {
                    "Buzz"
                } else if (i % 3 == 0) {
                    "Fizz"
                } else {
                    i.toString()
                }
            )
        }

        return res
    }
}