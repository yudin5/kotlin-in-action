package ch03

fun main() {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 6, 88)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    println("map[7] = ${map[7]}")

    val strings = listOf("first", "second", "third")
    println("strings.last = ${strings.last()}")

    val numbers = setOf(1, 4, 2, 45, 12)
    println("numbers.max() = ${numbers.min()}")
}