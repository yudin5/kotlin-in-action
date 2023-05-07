package ch02

import ch02.Color.*

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0), BLUE(0, 0, 255), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getWarmth(color: Color) =
    when (color) {
        RED, ORANGE, YELLOW -> "Теплый"
        GREEN -> "Нейтральный"
        BLUE, INDIGO, VIOLET -> "Холодный"
    }

fun getMnemonic(color: Color) =
    when (color) {
        RED -> "Каждый"
        ORANGE -> "Охотник"
        YELLOW -> "Желает"
        GREEN -> "Знать"
        BLUE -> "Где"
        INDIGO -> "Сидит"
        VIOLET -> "Фазан"
    }