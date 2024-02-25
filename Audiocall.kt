import java.time.LocalDate
import `Phone call`.*
import kotlin.random.Random

class Audiocall (var _code : String, var _number : String, empdate : LocalDate, emptime : Double):`Phone call`(empdate, emptime){

    fun Aud_input (code: String, number: String){
        println("Введите ваш номер телефона")
        _number = readLine()!!.toString()
    }
    fun City (code: String, number: String){
        println("Опередляем код города")
        if (_number.substring(0,1) == "+") {
            _code = _number.substring(2, 5)
        }
        else{
            _code = _number.substring(1, 4)
        }
    }
    fun Get_info (code: String, number: String){
        println("ваш код города: $_code")
        println("телефон: $_number")
        println("дата: $_date")
        println("продолжительность разговора: $_time")
    }
}