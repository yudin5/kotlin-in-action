package ch02.geometry

import java.util.*

data class Rectangle(var height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun main(args: Array<String>) {
    var rectangle = Rectangle(23, 23)
    println(rectangle)
    println("Квадрат? ${rectangle.isSquare}")

    rectangle.height = 34
    println(rectangle)
    println("Квадрат? ${rectangle.isSquare}")

    rectangle = createRandomRectangle()
    println(rectangle)
    println("Квадрат? ${rectangle.isSquare}")
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(3), random.nextInt(3))
}