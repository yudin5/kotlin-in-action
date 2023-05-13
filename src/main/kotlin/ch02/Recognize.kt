package ch02

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun recognize(c: Char) =
    when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know.."
    }

fun main() {
    println(isLetter('q'))
    println(isNotDigit('5'))
    println(isNotDigit('h'))

    println(recognize('g'))
    println(recognize('5'))
    println(recognize('#'))
}