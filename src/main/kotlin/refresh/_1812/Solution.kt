package refresh._1812

class Solution {

    fun squareIsWhite(coordinates: String): Boolean {
        return ((coordinates[0] - 'a') + (coordinates[1] - '0')) and 1 == 0
    }
}