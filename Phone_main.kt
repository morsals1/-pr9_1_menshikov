import java.time.LocalDate
import kotlin.random.Random

fun main(){
    try {
        //выбор
        println("выберите аудиозвонок(1) или видеозвонок(0)")
        var otv = readLine()!!.toInt()

        //общий класс
        println("напишите продолжительность разговора в минутах:")
        var time1 = readLine()!!.toDouble()
        val a: `Phone call` = `Phone call`(_date = LocalDate.now(), _time = time1)
        a.Set_time(time1)

        //наследники
        if(otv == 0) {
            val b: Videocall = Videocall(_ip = "", _app = "", empdate = LocalDate.now(), emptime = time1)
            b.Vid_input(ip = "", app = "")
            b.vid_app(ip = "", app = "")
            b.Get_info(ip = "", app = "")
        }
        else if (otv == 1){
            val c: Audiocall = Audiocall(_code = "", _number = "", emptime = time1, empdate = LocalDate.now())
            c.Aud_input(number = "", code = "")
            c.City(number = "", code = "")
            c.Get_info(number = "", code = "")
        }
        else {
            println("нужно тыкать 0 или 1, надеюсь в следущий раз будет понятно")
        }
    } catch (e:Exception) {
        println("неверный ввод")}
}