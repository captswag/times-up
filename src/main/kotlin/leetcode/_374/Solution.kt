package leetcode._374

class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var output = 0
        var low = 0
        var high = n

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (guess(mid) == 0) {
                output = mid
                break
            } else if (guess(mid) == -1) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return output
    }
}

abstract class GuessGame() {
    var randomNumber: Int = 0

    abstract fun guessNumber(n: Int): Int

    fun guess(num: Int): Int = if (randomNumber == num) 0
    else if (randomNumber < num) -1
    else 1

    fun choseRandom(n: Int) {
        randomNumber = (0..n).random()
    }
}