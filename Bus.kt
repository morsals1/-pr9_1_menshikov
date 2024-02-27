import Drive.*
class Bus (var _number : Int, var _exit_time : Double, var _come_time : Double , emptime : Double, emptravel : String, empdestination : String, emplength : Double)
    : Drive(empdestination, emptravel, emptime, emplength) {
    fun Right_bus(emplength: Double, emptime: Double){
        if (emplength <= 0) println("длинна поездки не может состовлять 0 км и меньше")
        else{
            var otv = 0
            val numbers = arrayOf(1,140,52,100)
            when{
                emptime > 9.00 && emptime <= 15.00 -> {
                    println("вам доступно два автобуса 1 или 52")
                    println("вебрите 1 поезд - (0) или 2 поезд - (1)")
                    otv = readln()!!.toInt()
                    if (otv == 0){
                        _number = numbers[0]
                    }
                    else if (otv == 1){
                        _number = numbers[2]
                    }
                    else{
                        println("введите или 1, или 0")
                    }
                }
                emptime > 15.00 && emptime <= 21.00 -> {
                    println("вам доступен один автобус 140")
                    _number = numbers[1]
                }
                emptime > 21.00 && emptime <= 3.00 -> {
                    println("вам доступно три автобуса 140 100 52")
                    println("вебрите 1 поезд - (0); 2 поезд - (1); 3 поезд - (2)")
                    otv = readln()!!.toInt()
                    if (otv == 0){
                        _number = numbers[1]
                    }
                    else if (otv == 1){
                        _number = numbers[3]
                    }
                    else if (otv == 2){
                        _number = numbers[2]
                    }
                    else{
                        println("введите или 1, или 0")
                    }
                }
                emptime > 3 && emptime <= 9.00 -> {
                    println("вам доступен один автобус 100")
                    _number = numbers[3]
                }
            }
        }
    }

    fun all_time(emptime: Double){
        when{
            _number == 1 -> {
                _come_time = emptime+1.00
                _exit_time = 0.2
                println("Время прибития $_come_time - Время стояник $_exit_time")

            }
            _number == 140 ->{
                _come_time = emptime+1.00
                _exit_time = 0.2
                println("Время прибития $_come_time - Время стояник $_exit_time")

            }
            _number == 52 -> {
                _come_time = emptime+1.00
                _exit_time = 0.2
                println("Время прибития $_come_time - Время стояник $_exit_time")

            }
            _number == 100 -> {
                _come_time = emptime+1.00
                _exit_time = 0.2
                println("Время прибития $_come_time - Время стояник $_exit_time")

            }
        }
    }

    fun ticket(empdestination: String, emplength: Double){
        println("поезд - $_number; поездка в $empdestination составит $emplength")
    }
}