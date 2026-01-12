package refresh._1678

class Solution {

    fun interpret(command: String): String {
        var commandIndex = 0
        val c = CharArray(command.length)
        var cIndex = 0

        while (commandIndex < command.length) {
            when (command[commandIndex]) {
                'G' -> c[cIndex++] = command[commandIndex]
                '(' -> {
                    commandIndex++
                    if (command[commandIndex] == ')') {
                        c[cIndex++] = 'o'
                    } else {
                        while (command[commandIndex] != ')') {
                            commandIndex++
                        }
                        c[cIndex++] = 'a'
                        c[cIndex++] = 'l'
                    }
                }
            }
            commandIndex++
        }

        return String(c, 0, cIndex)
    }
}