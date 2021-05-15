import extensions.getFieldUser
import extensions.highInline
import extensions.mapToUseUiModel
import user.User


fun addMessage(s: String) : Unit{
    println(s)
}

typealias UserAlias = User

fun main(args: Array<String>) {
    val user=User("John","Westbrook", 21)
    user.getFieldUser("Hello world", ::addMessage)

    val nameUiModel = user.mapToUseUiModel()
    println("name User = ${nameUiModel.surName}, surName User = ${nameUiModel.name}")

    val userAlias = UserAlias("Steven", "Butler", 29)
    println(userAlias.getFieldUser("hello class typeAlias", ::addMessage))

    val userInline = User("Kevin", "Tommy", 26)
    userInline.highInline(user.name,::addMessage)
}