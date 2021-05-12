package transport

abstract class Transport (val name: String,
                 val color: String,
                 val wheel:Int,
                 val numberOfPersons: Int) {

    abstract fun getInfoTransport() : String

}