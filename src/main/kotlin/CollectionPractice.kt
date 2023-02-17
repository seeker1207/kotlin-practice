import java.util.LinkedList

class CollectionPractice {

}

fun main() {

    // Immutable
    val currencyList = listOf("달러", "유로", "원")

    // mutable
    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    // immutable set
    val numberSet = mutableSetOf(1, 2, 3, 4).apply {
        add(1)

    }

    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)

    // 컬렉션 빌더 내부에선 mutable 반환은 immutable
    val numberList: List<Int> = buildList{
        add(1)
        add(2)
        add(3)
    }

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(1)
        addLast(2)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    // iterator 도 사용가능하다. (상속받음)
    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("---------------")
    for (currency in currencyList) {
        println(currency)
    }

    // foreach 라는 표준함수도 사용가능
    currencyList.forEach {
        println(it)
    }

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
//    val upperList = mutableListOf<String>()

    // for 문보다 훨씬 간단.
    val newUpperList = lowerList.map { it.uppercase() };
    println(newUpperList)

    val filteredList = newUpperList.filter { it == "B" }
    println(filteredList)

    // java8의 stream과 다른것은 터미널 오퍼레이터가 호출이 되지 않아도 동작을 한다.

    // asSequence를 호출하면 stream과 동일하게 동작한다.
    // filter 체인이 많아지면 collection 을 매일 항상 새로 만들기때문에 out of memory가 날수가 있다.
    // 따라서 대량의 데이터를 핸들링 할때는 asSequence를 고려해봐도 좋다.
    // 벤치마크상 데이터가 적으면 asSequence가 퍼포먼스 측면에서 낫다고도 한다.
    val filteredList2 = newUpperList
        .asSequence()
        .filter { it == "B" }
        .toList()

}