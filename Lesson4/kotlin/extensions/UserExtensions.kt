package extensions

import user.User
import user.UserUiModel

const val COUNT = 5

fun User.printUserFields(message: String, printFields:(String)->Unit)  {
     printFields(message)
     val space = " ".repeat(COUNT)
     printFields("this variable contains the identity of the user = name: " +
             "${this.name}$space, surName: ${this.surName}$space, age: ${this.age}$space")
}

fun User.mapToUseUiModel() = UserUiModel(
     name = "$name", surName = "$surName"
)

inline fun User.highInline(message:String, printFields:( s:String)->Unit) {
     addName(message)
     val space = " ".repeat(COUNT)
     addName("${this.name}$space, ${this.surName}$space, ${this.age}$space")
}






