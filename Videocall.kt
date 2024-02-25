import java.time.LocalDate
import `Phone call`.*
import kotlin.random.Random
class Videocall (var _ip : String, var _app : String, empdate : LocalDate, emptime : Double):`Phone call`(empdate, emptime){
    fun Vid_input (ip: String, app: String){
        println("Определяем ваш ip")
        val ip1 = Random.nextInt(10, 100)
        val ip2 = Random.nextInt(100, 1000)
        val ip3 = Random.nextInt(100, 1000)
        val ip4 = Random.nextInt(100, 1000)
        _ip = "$ip1.$ip2.$ip3.$ip4"
        println("$_ip")
    }
    fun vid_app (ip: String, app: String){
        println("Введите приложение с котрого вы совершаете видеозвонок")
        _app = readLine()!!.toString()
    }
    fun Get_info (ip: String, app: String){
        println("ваш ip: $_ip")
        println("приложение: $_app")
        println("дата: $_date")
        println("продолжительность разговора: $_time")
    }
}