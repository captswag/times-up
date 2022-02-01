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

fun DoubleArray.displayFormatted() {
    this.forEachIndexed { index, value ->
        if (index == 0) {
            print(value)
        } else {
            print(", $value")
        }
    }
    println()
}

fun Array<String>.displayFormatted() {
    this.forEachIndexed { index, value ->
        if (index == 0) {
            print(value)
        } else {
            print(", $value")
        }
    }
    println()
}

fun CharArray.display() {
    this.forEach { value ->
        print(value)
    }
    println()
}