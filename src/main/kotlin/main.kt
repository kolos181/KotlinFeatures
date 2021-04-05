import java.sql.SQLOutput

fun main(args: Array<String>) {
    var ignorecase = true
    println("What's your name?")
    var input = readLine()
    println("Well hello there $input")
    println(if (input.equals("bob", ignoreCase = ignorecase)) "I've been told that you are a machine" else "Yo're not bob")

}
