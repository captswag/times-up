package leetcode._1603

class ParkingSystem(big: Int, medium: Int, small: Int) {
    private val lotSize = intArrayOf(big, medium, small)

    fun addCar(carType: Int): Boolean {
        return if (lotSize[carType - 1] > 0) {
            lotSize[carType - 1]--
            true
        } else {
            false
        }
    }

}