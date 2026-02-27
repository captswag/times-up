package refresh._2011

class Solution {

    fun finalValueAfterOperations(operations: Array<String>): Int {
        var ans = 0

        for (o in operations) {
            if (o[1] == '+') {
                ans++
            } else {
                ans--
            }
        }

        return ans
    }
}