package ch02

import ch02.Color.*

fun main() {
    for (color in Color.values()) {
        val rgb = color.rgb()
        println("rgb = $rgb")
    }
    println(getMnemonic(INDIGO))
    println(getWarmth(BLUE))
    println(mix(BLUE, YELLOW))
//    println(mix(RED, INDIGO))
    println(mixOptimized(RED, YELLOW))
    println(mixOptimized(BLUE, INDIGO))
}

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Грязный цвет")
    }

fun mixOptimized(c1: Color, c2: Color) =
    // when без аргументов
    when {
        (c1 == RED && c2 == YELLOW) -> ORANGE
        (c1 == BLUE && c2 == YELLOW) -> GREEN
        else -> throw Exception("Dirty color")
    }