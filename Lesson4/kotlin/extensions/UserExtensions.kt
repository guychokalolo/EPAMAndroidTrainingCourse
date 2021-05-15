package extensions

import user.User
import user.UserUiModel

fun User.getFieldUser(s: String, highFun:(String)->Unit)  {
     highFun(s)
     val count = 5
     val space = " ".repeat(count)
     println("this variable contains the identity of the user = name: " +
             "${this.name}$space, surName: ${this.surName}$space, age: ${this.age}$space")
}

fun User.mapToUseUiModel() = UserUiModel(
     name = "$name", surName = "$surName"
)

inline fun User.highInline(s:String, addName:( s:String)->Unit) {
     addName(s)
     val count = 5
     val space = " ".repeat(count)
     println("${this.name}$space, ${this.surName}$space, ${this.age}$space")
}





