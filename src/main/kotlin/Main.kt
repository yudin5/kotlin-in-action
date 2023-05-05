fun max(a: Int, b: Int) = if (a > b) a else b


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
//    println("Hello, ${args[0]}!")
//    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}!")

    val size = args.size
    println(size)
    var newArgs = args.plus("abc")
    newArgs = newArgs.plus("ddd")
    newArgs = newArgs.plus("eee")
    val lastElement = newArgs.last()
    val firstElement = newArgs.first()
    println("newArgs = ${newArgs.joinToString()}")
    println("firstElement = $firstElement")
    println("lastElement = $lastElement")

    // Вызов функции
    println(max(4, 34))

    // Объявление переменных
    val question = "The Ultimate Question of Life, the Universe, and Everything"
    val answer: Int = 42
    println("Question = $question. Answer = $answer")
    val yearsToCompute = 7.5e6
    println("yearsToCompute = $yearsToCompute")

    // Неизменные ссылки, изменяемые объекты
    val languages = arrayListOf("Java")
    val someList = arrayListOf("sdf sdf sdf".split(" "))
    println("someList = $someList")
    languages.add("Kotlin")
    println("languages = $languages")
}