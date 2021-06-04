package generic

import transport.Transport

class Garage<T : Transport>(val transport : T){

    val listTransport : MutableList<T> = mutableListOf()

    fun addTransport(newTransport : T){
        listTransport.add(newTransport)
    }

    fun removeTransport(removeTransport : T){
       listTransport.remove(removeTransport)
    }

    fun getTransport() : Set<Transport>{ // or List<Transport>
        return listTransport.toSet()    // or toList()
    }
}