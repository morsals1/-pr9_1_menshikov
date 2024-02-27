open class Drive(var _destination : String, var _travel : String, var _time : Double, var _length : Double){
    open fun User_info(){
        try {
            println("введите куда вам нужно отправиться")
            _destination = readln()!!.toString()
            println("Введите сколько км туда ехать")
            _length = readln()!!.toDouble()
            println("Введите в какой день вам удобнее начать поездку")
            _travel = readln()!!.toString()
            println("Введите в какое время вам удобнее начать поездку")
            _time = readln()!!.toDouble()
        } catch (e:Exception) { println("неверный ввод") }
    }
}
