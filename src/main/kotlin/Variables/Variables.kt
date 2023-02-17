package Variables

// var는 mutable 한 값
// val은 immutable 한 값
// 강제하진 않지만 불변 값인 val을 권장한다.
fun main() {
    var a: String = "initial"
    println(a)

    val b: Int = 1
    val c = 3

    var e: Int
    e = 3
    e=5
//    println(e)

    val d: Int
    if (true) {
        d = 1
    } else {
        d = 2
    }

}
