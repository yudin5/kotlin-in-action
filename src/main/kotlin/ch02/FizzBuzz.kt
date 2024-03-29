package ch02

fun fizzBuzz(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz "
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }

fun main() {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }
    val oneToTen: IntRange = 1..10
    println("\noneToTen = $oneToTen")

    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
}