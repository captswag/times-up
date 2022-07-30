package leetcode._1656

class OrderedStream(n: Int) {

    private var index = 1
    private val valueArray = Array(1001) { "" }

    fun insert(idKey: Int, value: String): List<String> {
        val output = mutableListOf<String>()
        valueArray[idKey] = value
        while (index < valueArray.size && valueArray[index] != "") {
            output.add(valueArray[index++])
        }
        return output
    }

}