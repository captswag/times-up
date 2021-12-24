package extentions

fun IntArray.displayFormatted() {
    this.forEachIndexed { index, value ->
        if (index == 0) {
            print(value)
        } else {
            print(", $value")
        }
    }
    println()
}