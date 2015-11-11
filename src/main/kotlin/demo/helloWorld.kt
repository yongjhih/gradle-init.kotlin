package demo
import java.io.InputStream
import java.io.InputStreamReader
import java.io.BufferedReader
private val stdin: BufferedReader = BufferedReader(InputStreamReader(object : InputStream() {
    public override fun read(): Int {
        return System.`in`.read()
    }

    public override fun reset() {
        System.`in`.reset()
    }

    public override fun read(b: ByteArray): Int {
        return System.`in`.read(b)
    }

    public override fun close() {
        System.`in`.close()
    }

    public override fun mark(readlimit: Int) {
        System.`in`.mark(readlimit)
    }

    public override fun skip(n: Long): Long {
        return System.`in`.skip(n)
    }

    public override fun available(): Int {
        return System.`in`.available()
    }

    public override fun markSupported(): Boolean {
        return System.`in`.markSupported()
    }

    public override fun read(b: ByteArray, off: Int, len: Int): Int {
        return System.`in`.read(b, off, len)
    }
}))

public fun readText(): String? = stdin.readText()

fun main(args: Array<String>) {
    //java.io.BufferedReader(java.io.InputStreamReader(System.`in`)).forEachLine{println(it)}
    //java.io.InputStreamReader(System.`in`).forEachLine{println(it)}
    //println(java.io.InputStreamReader(System.`in`).readText())
    print(readText())
}
