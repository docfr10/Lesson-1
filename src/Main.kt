import java.text.DecimalFormat

fun main() {
    /*

    // Однострочный комментарий

    /*
    Многострочный комментарий
     */

    // Вывод в консоль
    print("Hello World! 1") // Вывод текста без отступа
    println("Hello World! 2") // Вывод текста с отступом
    print("Hello World! 3") // Вывод текста без отступа

    println()
    println("РАЗДЕЛ ПЕРЕМЕННЫЕ")

    // Переменные
    /*
    В Котлине есть два типа переменных
    1) Изменяемые — var — variable
    2) Неизменяемые — val — value
    */

    // Первая переменная
    val a = 1
    var b = 2

    b = 2
    // Вывод переменных
    println(a)
    println(b)

    // Явный и неявный тип данных
    // 1) Неявный — Явно не указали тип данных, можно узнать
    // наведясь мышкой
    val c = 5

    // 2) Явное объявление типа данных
    val d: Long = 10

    // Основные числовые типы данных
    // Целочисленные — Int, Long
    val c1 = 10L

    // Вещественные — Float, Double
    val e: Float = 4.6F

    // Boolean — true, false
    var f = true
    f = false

    // Основные строковые типы данных
    // String и Char
    val str = "Hellosdgs'lem;kgv;lnsvk;mesdv jblsd" +
            "s" +
            "v" +
            "sd" +
            "bs" +
            "d" +
            "vg" +
            "sdgvsd"
    val char: Char = '3'

    // Арифметические операции
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b) // Целочисленное деление
    println(a % b) // Остаток от деления

    println(a / e) // Результат будет дробный, так как "e" — Float

    var counter = 0
    counter += 5
    counter--
    counter++

    println(counter)

    // Преобразование типов — операция to + тип данных
    var i: Int = 100
    val l = i.toDouble()

    val str1 = "123"
    println(str1.toDouble())

    // Строковые шаблоны
    val name = "Nikita"
    val age = 24

    println("Меня зовут " + name + ", мне " + age + "лет")
    println("Меня зовут $name, мне $age")

    println("Меня зовут ${name.length}, ${age + 10}")

    val str3 = """ afgasdflsadkfkdsaf
                           asljfnaljsf
        fajnfasfjasf
                        asljfnsajl
    """
    println(str3)
    println(str3.trimIndent())

    val str4 = "kotlin"
    val str5 = "KOTLIN"

    println(str4 == str5)
    println(str4 != str5)
    // Перевод регистров
    println(str4.uppercase() == str5.lowercase())

    // Ввод с консоли
    println("Введите имя")
    val myName = readln()
    println(myName)

    // Ввод нескольких значений через символ разделитель
    val (digit1, digit2) = readln().split(" ")
    println("Число 1 = $digit1, Число 2 = $digit2")

    // Условия
    val temp = readln().toDouble()

    if (temp > 25) {
        println("Жарко")
    } else if (temp < 0)
        println("Холодно")
    else {
        println("Нормально")
    }

    // Логические операторы
    // && — И, || — или, ! — отрицание(не)

    // If-else в виде переменной
    val desc = if (temp > 15) {
        println("temp > 15")
        15
    } else temp.toInt()

    // When как замена if-else
    val day = readln().toInt()

    val result = when (day) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        in 4..5 -> "Четверг или Пятница" // Диапазон
        6,7 -> "Выходной"

        else -> "Это не день недели"
    }
    println(result)


     */


    /*
    // Диапазоны
    val r1 = 1..5 // от 1 до 5 включительно
    val r2 = 1 until 5 // от 1 до 4
    val r3 = 5 downTo 1 // от 5 до 1 включительно
    val r4 = 1.0..100.0
    val r5 = 1..5 step 2 // от 1 до 5 с шагом 2

    // Циклы
    for (i in r3) {
        println(i)
    }

    val r6 = 1
    val r7 = 7

    for (i in r6..r7) {
        println(i)
    }

    repeat(5) {
        println("Hi!")
    }

    var n = 0
    // Цикл с предусловием
    while (n < 100) {
        n += 25
        println(n)
    }

    var m = 0
    // Цикл с постусловием
    do {
        m += 25
        println(m)
    } while (m < 100)

    // Команды внутри цикла
    for (i in 1..10) {
        for (j in 1..10) {
            if (j == 3)
                return // Выход из всех циклов

            if (j == 5)
                break // Выход из одного цикла
        }

        if (i == 7)
            continue // Пропуск
    }
     */

    // Вызов функции без аргумента
    sum1()
    // Вызов функции с аргументами
    val sum5 = sum2(5, 6)
    println(sum3(5, 6))

    create(5) // вывод будет 15, так как b не указана
    create(5, 9) // сумма будет 14, так как изменили b

    // Коллекции
    // Список — неизмяемый снаружи и внутри
    val list = listOf(1, 2, 3, 4, 5)
    println(list)
    println(list[4])

    // Массив — менять внутри можно
    val array = arrayOf(1, 2, 3, 4, 5)
    array[0] = 5

    val string = "Fsafasfasfas"
    println(string[6])
}

// Создание функции без аргументов
fun sum1() {
    println(5 + 5)
}

// Создание функции с аргументами и возвращаемым значением
fun sum2(a: Int, b: Int): Int {
    return a + b
}

// Однострочная функция без явного указания возвращаемого значения
fun sum3(a: Int, b: Int) = a + b

// Функция с параметром по умолчанию
fun create(a: Int, b: Int = 10) {
    println(a + b)
}