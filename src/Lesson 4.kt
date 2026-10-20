import kotlin.math.PI

// Абстрактный класс — не имеет реализации, используется ТОЛЬКО для наследования
abstract class Shape(val name: String) {
    // Абстрактные функции — не имеют реализации в родительском классе
    // НО обязательно должны быть реализованы в дочерних классах
    abstract fun area(): Double
    abstract fun perimeter(): Double

    // При этом в абстрактном классе могут быть функции с
    // возвращаемым значением и реализацией
    fun describe(): String {
        return name
    }
}

class Circle(val radius: Double, name: String) : Shape(name) {
    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Square(val width: Double, name: String) : Shape(name) {
    override fun area(): Double {
        return width * width
    }

    override fun perimeter(): Double {
        return 4 * width
    }
}

// Интерфейс
interface Flyable {
    // В интерфейсе по умолчанию все методы и свойства абстрактные и
    // должны быть реализованы в дочерних классах
    fun fly()

    fun land() {
        println("Приземлился")
    }
}

// Абстрактный класс можно наследовать только единожды
abstract class NewAnimal(name: String)

// А интерфейс сколько угодно раз
interface Swimable {
    fun swim()
}

class Bird(val name: String) : NewAnimal(name), Flyable, Swimable {
    override fun fly() {
        println("$name машет крыльями")
    }

    override fun land() {
        println("$name успешно приземлилась")
    }

    override fun swim() {
        println("$name поплыла")
    }
}

class Human(val name: String) : Flyable {
    override fun fly() {
        println("Человек $name полетел")
    }

    override fun land() {
        println("Полет его был недолгим...")
    }
}

// data класс
data class Point(val x: Double, val y: Double)

interface A {
    fun doSomething() {
        println("doSomething")
    }
}

interface B {
    fun doSomething()
}

class C : A, B {
    override fun doSomething() {
        super<A>.doSomething()
    }
}

// enum класс — класс, в котором записаны перечисления
enum class OrderState(val value: String) {
    NEW("new"),
    PAID("paid"),
    DELIVERED("delivered"),
    CANCELLED("cancelled");

    fun changeState(state: OrderState): OrderState {
        return when (state) {
            NEW -> PAID
            PAID -> DELIVERED
            DELIVERED -> CANCELLED
            CANCELLED -> NEW
        }
    }
}

fun main() {
    val circle = Circle(10.0, "Круг")
    val square = Square(5.0, "Квадрат")

    println("Вывод значения круга")
    println(circle.area())
    println(circle.perimeter())
    println(circle.describe())

    println("Вывод значения квадрата")
    println(square.area())
    println(square.perimeter())
    println(square.describe())

    val bird = Bird("Jack")
    bird.fly()
    bird.land()
    bird.swim()

    val human = Human("Брюс Уэйн")
    human.fly()
    human.land()

    // Операции с data классами
    val point1 = Point(10.0, 20.0)
    val point2 = Point(-10.0, 42.0)
    println(point1)
    println(point2)

    // Сравнение по смыслу
    println(point1 == point2)
    // Сравнение по ссылке
    println(point1 === point2)
    println(point1 === point1)

    val orderState = OrderState.NEW
    orderState.changeState(OrderState.DELIVERED)

    // Класс импортирован из другого модуля
    val ui = UI()
    // Класс нельзя импортировать из другого модуля из-за
    // модификатора internal
    // val data = Data1()

}