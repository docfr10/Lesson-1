fun main() {
    // Null безопасность — для переменной, если она может иметь значение null
    // в типе данных указывается "?"
    var name: String? = "James"
    println(name)
    // Оператор безопасного вызова реализуется через "?."
    // и позволяет вызывать свойства у nullable переменных
    println(name?.length)

    // Оператор небезопасного вызова "!!." — игнорирует то, что в переменной может быть записан null
    // и пытается вызвать свойство переменной даже если оно недоступно
    println(name!!.length)

    name = null
    println(name)
    println(name?.length)

    // Оператор Элвиса записывается через "вызов null объекта ?:"
    // и берет значение справа, если свойство null, иначе выдает значение слева
    println(name?.length ?: "New James")

    // Структуры данных

    // List — неизменяемая структура данных
    val cities = listOf("Москва", "Казань", "Саратов", "Сочи", "Саратов")
    // Основные методы
    println(cities.size) // Размер списка
    println(cities[2]) // Выдача элемента по индексу начиная с 0
    println(cities.indexOf("Сочи")) // Выдача индекса по названию элемента
    println(cities.getOrNull(100)) // Выдача элемента по индексу, если его нет, выдача  null

    // Set — множество неизменяемая коллекция, в нем хранятся только уникальные элементы
    val cities2 = setOf("Москва", "Казань", "Саратов", "Сочи", "Москва", "Сочи")
    println(cities2)
    // Вхождение в состав множества
    println("Казань" in cities2)

    // Выдача уникальный элементов List
    println(cities.distinct())

    // Map — неизменяемая коллеция, где данные хранятся в формате "ключ-значение",
    // аналог словаря из Python
    val cities3 = mapOf(
        "Россия" to "Москва",
        "Франция" to "Париж",
        "Великобритания" to "Лондон"
    )

    println(cities3.keys) // Вывод значений ключей
    println(cities3.values) // Вывод значений

    // ИЗМЕНЯЕМЫЕ КОЛЛЕКЦИИ
    // Изменяемый список
    val people = mutableListOf("Борис", "Анна", "Никита", "Ерм", "Ёрм")
    people.addFirst("Евгений") // Добавить элемент в начало
    people.addLast("Петр") // Добавить элемент в конец
    people.add("Ёрм")
    people.add("Ерм")
    people.add(3, "Светлана") // Добавление элемента по индексу

    println(people)

    people.removeAt(2) // Удаление элемента по индексу
    println(people)

    // ОПЕРАЦИИ ФИЛЬТРАЦИИ И СОРТИРОВКИ
    val words = listOf("Helo", "World", "my", "name", "is", "Nikita")

    // filter — оставить значения, подходящие по условию
    println(words.filter {
        // it — обращение к элементам списка
        it.length > 5
    })

    // map — преобразование каждого элемента
    println(words.map { it + "new word" })

    // lowercase и uppercase для повышения и понижения регистра
    println(words.map { it.lowercase() })

    println(words.any { it == "is" })
    println(words.all { it == "is" })
    println(words.none { it == "!is" })
    println(words.count { it == "is" })

    val digits = listOf(5, 6, 2, 6, 9, 2, 132, 9, 210)
    println(digits.sorted()) // Сортировка по возрастанию
    println(digits.sortedDescending()) // Сортировка по убыванию

    println(words.sortedBy { it.length }) // Сортировка по возрастанию длины строки
    println(words.sortedByDescending { it.length }) // Сортировка по убыванию длины строки

    println(people.sorted())

    println(listOf(1, 2, 3, 4, 5).sorted())

    // АГРЕГАЦИЯ И СРЕЗЫ
    println(digits.sum()) // Сумма
    println(digits.min()) // Минимальное
    println(digits.max()) // Максимальное
    println(digits.average()) // Среднее

    println(digits.take(4)) // Срез первых n значений
    println(digits.takeLast(4)) // Срез последних n значений
    println(digits.drop(4)) // Срез без учета первых n
    println(digits.chunked(2))
    println(digits.dropLast(3))
}