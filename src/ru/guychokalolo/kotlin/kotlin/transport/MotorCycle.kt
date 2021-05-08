package transport

class MotorCycle(name: String,
                 color: String,
                 wheel: Int,
                 numberOfPersons: Int) : Transport(name, color, wheel,numberOfPersons) {


    override fun getInfoTransport() : String {
        return "$name, $color, $wheel, $numberOfPersons"
    }
}