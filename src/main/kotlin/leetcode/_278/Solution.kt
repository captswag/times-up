package leetcode._278

class Solution : VersionControl() {
    override fun findBadVersion(n: Int): Int {
        var low = 1
        var high = n
        var output = 0

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (isBadVersion(mid)) {
                output = mid
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return output
    }
}

abstract class VersionControl {
    var badVersion = 0
    abstract fun findBadVersion(n: Int): Int
    fun isBadVersion(version: Int): Boolean = version >= badVersion
}