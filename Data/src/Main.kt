// Модификатор доступа internal запрещает обращаться к классам/функциям вне своего модуля
internal class Data1 {
    fun showData() {
        println("Show Data")
    }
}

fun main() {
    val data1 = Data1()
}