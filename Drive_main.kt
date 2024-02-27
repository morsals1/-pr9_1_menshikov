
fun main(){
    val a: Drive = Drive(_destination = "", _travel = "", _time = 0.0, _length = 0.0)
    //общий класс
    a.User_info()
    //наследники
    var otv = 0
    if (a._length < 1000){
        println("Ваша поездка состовляет меньше 1000км, вам можно выбрать как автобусб так и поезд")
        println("автобус - (1); поезд - (0)")
        otv = readLine()!!.toInt()
    }
    if (otv == 0) {
        val b: Train = Train(_number = 0, _exit_time = 0.0, _come_time = 0.0, emptime = 0.0, emptravel = "", empdestination = "", emplength = 0.0)
        b.Right_train(emplength = a._length, emptime = a._time)
        b.all_time(emptime = a._time)
        b.ticket(empdestination = a._destination, emplength = a._length)
    }
    else if (otv == 1) {
        val c: Bus = Bus(_number = 0, _exit_time = 0.0, _come_time = 0.0, emptime = 0.0, emptravel = "", empdestination = "", emplength = 0.0)
        c.Right_bus(emplength = a._length, emptime = a._time)
        c.all_time(emptime = a._time)
        c.ticket(empdestination = a._destination, emplength = a._length)
    }
    else{
        println("вам нужно выбрать автобус - (1) или поезд - (0)")
    }
}