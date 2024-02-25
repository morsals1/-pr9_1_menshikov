import java.time.LocalDate

open class `Phone call`(var _date: LocalDate, var _time: Double) {
    open fun Set_time(time : Double){
        when{
            _time <= 0 -> println("Не может быть отрицательного или нулеовго времени разговора: ${_date} = ${_time}")
            (_time > 0 && _time <= 10) -> {
                this._time = time
                println("Вы недолго говорите по телефону: ${_date} = ${_time}")
            }
            (_time > 10 && _time <= 30) -> {
                this._time = time
                println("Вы любите поговрить по телефону: ${_date} = ${_time}")
            }
            (_time > 30)-> {
                this._time = time
                println("Вы очень долго разговариваете по телефону: ${_date} = ${_time}")
            }
        }
    }
}
