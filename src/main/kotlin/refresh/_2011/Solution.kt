package refresh._2011

class Solution {

    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0

        for (operation in operations) {
            when (operation) {
                "++X", "X++" -> x++
                "--X", "X--" -> x--
            }
        }

        return x
    }
}