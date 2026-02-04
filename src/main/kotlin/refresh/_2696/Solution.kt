package refresh._2696

import java.util.*

class Solution {

    fun minLength(s: String): Int {
        val stk = Stack<Char>()

        for (c in s) {
            if (stk.isNotEmpty() && ((stk.peek() == 'A' && c == 'B') || (stk.peek() == 'C' && c == 'D'))) {
                stk.pop()
            } else {
                stk.push(c)
            }
        }

        return stk.size
    }
}