fun main() {
    val items = setOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items -> println("juicy")
        "banana" in items -> println("And here's banana")
        "apple" in items -> println("apple is fine too")
    }
}