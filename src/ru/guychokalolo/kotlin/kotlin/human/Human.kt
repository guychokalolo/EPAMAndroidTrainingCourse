package human

import status.Status

sealed class Human {
    data class Student(val name:String,
                       val age:Int,
                       val sumPoint: Int,
                       val optionSchool: String,
                       val status : Status )

    data class Teacher(val name: String,
                       val age: Int,
                       val stage:Double,
                       val status: Status)

    data class Rector(val name: String,
                      val stage: Double,
                      val nameUniversity: String,
                      val status: Status)
}
