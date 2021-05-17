import extensions.printUserFields
import extensions.highInline
import extensions.mapToUseUiModel
import user.User


fun addMessage(s: String) : Unit{
    println(s)
}

typealias UserAlias = User

fun main(args: Array<String>) {
    val user=User("John","Westbrook", 21)
    user.printUserFields("Hello world", ::addMessage)

    val nameUiModel = user.mapToUseUiModel()
    println("surname User = ${nameUiModel.surName}, name User = ${nameUiModel.name}")

    val userAlias = UserAlias("Steven", "Butler", 29)
    userAlias.printUserFields("hello class typeAlias", ::addMessage)

    val userInline = User("Kevin", "Tommy", 26)
    userInline.highInline(user.name,::printFields)
}