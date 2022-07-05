package leetcode._359

class Logger() {
    val map = mutableMapOf<String, Int>()

    fun shouldPrintMessage(timestamp: Int, message: String): Boolean {
        val nextTimestamp = map[message]
        return if (nextTimestamp == null) {
            map[message] = timestamp + 10
            true
        } else {
            if (timestamp < nextTimestamp) {
                false
            } else {
                map[message] = timestamp + 10
                true
            }
        }
    }

}