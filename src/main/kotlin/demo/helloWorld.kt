package demo

fun getGreeting(): Int {
    return (1..3).reduce{x,y->x*y}
}

fun printGreeting(): Int {
    print((1..3).reduce{x,y->x*y})
    return 0
}

fun main(args: Array<String>) {
    println(getGreeting())
}
