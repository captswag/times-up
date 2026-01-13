package refresh._1812

class Solution {

    fun squareIsWhite(coordinates: String): Boolean {
        val row = 8 - (coordinates[1] - '0')
        val col = coordinates[0] - 'a'

        return when {
            row and 1 == 0 && col and 1 == 1 -> false
            row and 1 == 0 && col and 1 == 0 -> true
            row and 1 == 1 && col and 1 == 1 -> true
            else -> false
        }
    }
}