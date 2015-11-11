package demo

fun main(args: Array<String>) {
    //println(java.io.InputStreamReader(System.`in`).readLines{it.reversed()})
    java.io.InputStreamReader(System.`in`).useLines{it.asIterable().reversed().forEach{println(it)}}
}
