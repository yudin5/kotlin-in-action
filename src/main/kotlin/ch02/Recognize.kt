package ch02

import kotlin.random.Random
import kotlin.random.nextInt

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

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))

    val percentage = Random.nextInt(-10..150)
    if (percentage !in 0..100) {
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $percentage")
    }

    val percentage2 =
        if (percentage in 20..90)
            percentage
        else
            throw IllegalArgumentException("Must be between 20 and 90: $percentage")

}