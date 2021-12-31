package extentions

fun <E> List<E>.displayFormatted() {
    this.forEachIndexed { index, value ->
        if (index == 0) {
            print(value)
        } else {
            print(", $value")
        }
    }
    println()
}