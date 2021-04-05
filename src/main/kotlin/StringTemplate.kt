fun main() {
    val arr = IntArray(5){it}
    arr.forEach {
        if(it is Int) print(it)
    }

}