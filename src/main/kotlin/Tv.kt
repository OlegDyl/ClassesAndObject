class TV(val brand: String, val model: String, val diagonal: String) {

    var tvIsOn = false  // телевизор по умолчанию включен
    var volume: Int = 20  // звук в телевизоре(по умолчанию на 20)
    private var channel:  List<String> = channelmix()  // список каналов для телевизора

    fun pult (functions: Int) {
        when (functions) {
            1 -> tvOnOff() // добавить условие, если телевизор выключен, то выключить и сохранить канал и громкость, если выключен то включить
            2 -> channelsUp() // переключения передач вверх + включает телевизор если он был выключен
            3 -> channelsDown() // переключение передач вниз + включает телевизор если он был выключен
            4 -> channelManual() // переключения канала на заданный канал + включает телевизор если он был выключен
            5 -> volumeUp() // функция увеличение громкости
            6 -> volumeDown() // функция уменьшение громкости
            7 -> channelList() // список всех доступных каналов
            else -> println("Вы нажали не ту кнопку")
        }
    }

    fun tvOnOff() {      // функция включения телевизора кнопка

        return if(tvIsOn == false) {
            tvIsOn = true
            println ("Телевизор включен")}
        else {
            tvIsOn = false
            println ("Телевизор выключен")
        }
    }

    fun channelsUp() {   // функция переключения каналов вниз, переключение каналов в порядке возрастания и убывания (аналог нажатия кнопок переключения каналов «Вверх» и «Вниз» на пульте
        println("Сколько секунд вы жмете кнопку переключения передач?")
        var counter = 0
        var time: Int = readLine()?.toIntOrNull() ?: return
        val channel = channelmix()
        println(channel.size)
        repeat(time) {
            Thread.sleep(1000)
            println(channel[counter])
            if (counter >= (channel.size - 1)) counter = 0 else counter += 1
        }
    }

    fun channelsDown() {  // функция переключения каналов вниз, переключение каналов в порядке возрастания и убывания (аналог нажатия кнопок переключения каналов «Вверх» и «Вниз» на пульте
        println("Сколько секунд вы жмете кнопку переключения передач?")
        var counter = 0
        var time: Int = readLine()?.toIntOrNull() ?: return
        val channelTv = channelmix()
        repeat(time) {
            Thread.sleep(1000)
            println(channelTv[counter])
            if (counter <= 0) counter = (channelTv.size - 1) else counter -= 1
        }
    }

    fun channelManual() { // переключение канала на заданный (аналог нажатия кнопки с цифрой канала на пульте)
        println("Введите номер канала")
        var channelManual: Int = readLine()?.toIntOrNull() ?: return
        val channel = channelmix()
        println(channel[channelManual])
    }

    fun volumeUp() {  // функция увеличения громкости на заданную величину
        println("Введите цифру на сколько хотите увеличить громкость:")
        val c: Int = readLine()!!.toInt()
        var b = 20 + c
        if (b > 100) {
            b = 100
        }
        println("Теперь громкость $b")
    }

    fun volumeDown() {  // функция уменьшения громкости на заданную величину
        println("Введите цифру на сколько хотите уменьшить громкость")
        val c: Int = readLine()!!.toInt()
        var b = 20 - c
        if (b < 0) {
            b = 0
        }
        println("Теперь громкость $b")
    }

    fun channelList() {   // функция предоставление списка каналов в виде порядковый номер - название канала для отображения
        val channels = channelmix().forEachIndexed { index, value ->
            println("${index + 1} - $value")
        }
        return println(channels)
    }
}













