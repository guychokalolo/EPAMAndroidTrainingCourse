package transport

data class Bike(override val name: String,
                override val wheelCount:Int,
                override val year: Int) : Transport(name, wheelCount, year) {
}