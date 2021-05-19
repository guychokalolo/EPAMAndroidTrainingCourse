import generic.Garage
import generic.mapUiModel
import transport.Bike
import transport.Car
import transport.Transport

fun main(args: Array<String>) {

    val car = Car("Lada", 4, 2002)
    val car2 = Car("Volvo", 4, 1996)
    val bike = Bike("Salvador", 2, 2017)

    val carGarage = Garage(car)
    val carGarage2 = Garage(bike)

    carGarage.addTransport(car)
    println(carGarage.getTransport())

    carGarage2.addTransport(bike)
    println(carGarage2.getTransport())

    val filterTransport = carGarage.getTransport()
        .sortedBy { item -> item.name }
        .filter { it.name == "Lada" }
        .map { it.mapUiModel() }

}