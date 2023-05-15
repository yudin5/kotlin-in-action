package ch02

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
    val number = try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("2sd"))
    readNumber(reader)
}