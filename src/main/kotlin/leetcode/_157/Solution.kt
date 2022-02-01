package leetcode._157

class Solution : Reader4() {
    override fun read(buf: CharArray, n: Int): Int {
        var bufIndex = 0
        var length: Int

        do {
            val buf4 = CharArray(4)
            length = read4(buf4)

            for (buf4Index in 0 until 4) {
                if (bufIndex == n || buf4Index >= length) { // We only need to read n characters, so if index reaches n, then we stop
                    break
                } else {
                    buf[bufIndex] = buf4[buf4Index] // Moving Char from buf4 into buf
                    bufIndex++
                }
            }
        } while (length == 4)

        return bufIndex
    }
}

abstract class Reader4 {
    var file: String = ""
    private var index = 0

    fun read4(buf4: CharArray): Int {
        // We have to read four characters, hence we have a loop of 4
        var counter = 0
        while (counter < 4) {
            if (index < file.length) {
                buf4[counter] = file[index]
                index++
            } else {
                break
            }
            counter++
        }
        return counter
    }

    abstract fun read(buf: CharArray, n: Int): Int
}