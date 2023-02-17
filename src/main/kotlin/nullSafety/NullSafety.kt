package nullSafety

fun main() {
    var neverNull: String = "이건 널이 될수 없어요!"
//    neverNull = null

    var nullable: String? = "이건 널이 될수 있답니다~!"
    nullable = null

    var inferredNonNull = "컴파일러는 암묵적으로 non-null로 가정해요!"
//    inferredNonNull = null

    fun strLength(널이될수없는값: String): Int {
        return 널이될수없는값.length
    }

    strLength(neverNull)
//    strLength(nullable)
}