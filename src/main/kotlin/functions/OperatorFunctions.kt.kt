package functions

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "허")

    3.rangeTo(5)

    operator fun String.get(range: IntRange) = substring(range)
    val str = "나는 자랑스러운 대한민국 군인이당"
    println(str[0..4])
}