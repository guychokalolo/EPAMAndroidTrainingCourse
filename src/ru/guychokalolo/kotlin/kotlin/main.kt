import human.Human
import status.Status
import teacher.Teacher
import transport.Bus

fun main(args: Array<String>) {


    /** for teacher package**/
    /*val teacher = Teacher("Scotty","Bob", 27, 2.5, "IT2041")
    val teacher2 = Teacher("Scotty","Bob", 27, 2.5, "IT2041")

    println(teacher.hashCode())
    println(teacher.toString())
    println(teacher==(teacher2))*/

    /** for transport package**/

    /*val bus = Bus("Audi", "Red", 4, 5)

    println(bus.getInfoTransport())*/


    /**for status package **/

    /*val status = Status.MARRIED

    when(status){

        Status.MARRIED -> print("i am Married")
        Status.NO_MARRIED-> print("i am not Married")
    }*/


    /** for human package**/

    val student = Human.Student("Harry", 16,72,"computer science", Status.NO_MARRIED)

    //println(student.optionSchool)
}