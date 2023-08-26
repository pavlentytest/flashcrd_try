import java.util.*

fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    val scanner = Scanner(System.`in`)
    while(scanner.hasNextLine()) {

            val name = scanner.next()
            if(name == "stop") {
                break
            }
            val age = scanner.next()
            studentsMarks[name] = studentsMarks[name] ?: age.toInt()


    }
    println(studentsMarks)

}