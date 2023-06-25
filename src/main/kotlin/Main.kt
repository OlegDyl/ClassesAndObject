fun main() {
    val lg = TV(brand = "LG", model = "32LQ", diagonal = "32")
    val xiaome = TV(brand = "Xiaome", model = "Q2 55", diagonal = "55")
    val samsung = TV(brand = "Samsung", model = "Q80B", diagonal = "55")


    println(
        "Вам доступны следующие кнопки \n" +
                "1 - кнопка включения/выключения телевизора \n" +
                "2 - кнопка переключения передач вверх \n" +
                "3 - кнопка переключения передач вниз \n" +
                "4 - кнопка переключения канала на заданный \n" +
                "5 - кнопка увеличения громкости \n" +
                "6 - кнопка уменьшения громкости \n" +
                "7 - список всех доступных каналов"
    )

    println("Нажмите кнопку:")
    var functions: Int = readLine()?.toIntOrNull() ?: return
    if (functions !in 1..7) {
        println("Ошибка! Вы нажали не ту кнопку")
        println("Попробуйте еще раз: ")
        functions = readLine()?.toIntOrNull() ?: return

    }

     lg.pult(functions)

}







