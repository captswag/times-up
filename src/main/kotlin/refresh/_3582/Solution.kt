package refresh._3582

class Solution {

    fun generateTag(caption: String): String {
        var i = 0
        val sb = StringBuilder()
        sb.append('#')

        while (i < caption.length && sb.length < 100) {
            if (caption[i] != ' ') {
                if (i == 0 || caption[i - 1] == ' ') {
                    if (sb.length == 1) {
                        sb.append(caption[i].lowercaseChar())
                    } else {
                        sb.append(caption[i].uppercaseChar())
                    }
                } else {
                    sb.append(caption[i].lowercaseChar())
                }
            }
            i++
        }

        return sb.toString()
    }
}