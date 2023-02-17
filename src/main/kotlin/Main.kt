enum class PaymentStatus(val label: String) : Payable{
    UNPAID("미지급") {
        override fun isPayable(): Boolean = true
                  },
    PAID("지급완료") {
        override fun isPayable(): Boolean = false
                 },
    FAILED("지금실패") {
        override fun isPayable(): Boolean = false
                   },
    REFUNDED("환불") {
        override fun isPayable(): Boolean = false
    };
}

interface Payable {
    fun isPayable(): Boolean
}

class Person(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main(args: Array<String>) {
    val person1 = Person(name = "tony", age = 12)
    val person2 = Person(name = "tony", age = 12)

    println(person1 == person2)

}