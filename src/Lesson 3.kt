// Класс как структура определяет то, какими свойствами и методами должны
// обладать все его потомки/экземплеры/объекты
class OldCar {
    // Переменные внутри класса — свойства/поля
    var wheel: Int = 4
    var steeringWheel = true
    var brand = "Lada"
}

// Пример класса с конструктором
class Car(var brand: String, val wheel: Int = 4, val power: Double) {
    // Блок init выполняется один раз при создании экземпляра класса
    init {
        // Поле newCar будет доступно ТОЛЬКО внутри блока init и
        // обратиться к нему из объекта класса будет невозможно
        val newCar = true
    }

    // Метод — это функция внутри класса
    fun ride() {
        println("Ride $brand")
    }

    override fun toString(): String {
        return "brand: $brand, wheel: $wheel, power: $power"
    }
}

// Класс с демонстрацией принципа инкапсуляции
class Person(public var name: String, private var age: Int) {
    // Метод гетер для доступа к значению свойства
    fun getAge(): Int {
        return age
    }

    // Метод сетер для изменения значения свойства
    fun setAge(age: Int) {
        // this — ключевое слово для ЯВНОГО обращения к свойству класса
        this.age = age
    }

    // Более простой способ объявления гетера и сетера в Котлине
    var lastName: String = "Дерден"
        private set
}

open class Animal(val name: String, var age: Int, var type: String) {
    open fun sound() {}
}

class Dog(name: String, age: Int, type: String) : Animal(name, age, type) {
    override fun sound() {
        println("Гав-гав")
    }
}

class Cat(name: String, age: Int, type: String) : Animal(name, age, type) {
    override fun sound() {
        println("Мяу-мяу")
    }
}

class Bober(name: String, age: Int, type: String) : Animal(name, age, type) {
    override fun sound() {
        println("Издает звуки")
    }
}

fun main() {
    // Экзепляр класса — это его реализация в виде переменной
    val car1 = OldCar()
    val car2 = OldCar()

    car2.brand = "Moscvich"
    car2.wheel = 5

    println("Эта машина бренда ${car1.brand}, она имеет ${car1.wheel} колес")
    println("Эта машина бренда ${car2.brand}, она имеет ${car2.wheel} колес")

    println(car1)
    println(car2)

    val newCar1 = Car("Volga", power = 4.4)
    val newCar2 = Car("Ё-мобиль", power = 0.0)
    newCar1.brand = "Маруся"

    println("Эта машина бренда ${newCar1.brand}, она имеет ${newCar1.wheel} колес")
    println("Эта машина бренда ${newCar2.brand}, она имеет ${newCar2.wheel} колес")
    newCar1.ride()

    println(newCar1.toString())

    // РАБОТА С ИНКАПСУЛЯЦИЕЙ
    val person = Person("Расказчик", 30)
    person.name = "Тайлер"
    println(person.getAge())
    person.setAge(29)
    println(person.getAge())
    person.lastName

    val cat = Cat("Гав", 22, "Кот")
    val dog = Dog("Рыжик", 40, "Собак")
    val bober = Bober("Vadim", 20, "Bober")

    cat.sound()
    dog.sound()
    bober.sound()
}








