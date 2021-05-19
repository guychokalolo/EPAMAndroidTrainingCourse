package generic

import transport.Transport

class Garage<T : Transport>(val transport : T){

    val listTransport : MutableList<T> = mutableListOf()

    fun addTransport(newTransport : T){
        listTransport.add(newTransport)
    }

    fun removeTransport(){
        when(transport){
            Transport::class -> listTransport.remove(transport)
        }
    }

    fun getTransport() : Set<Transport>{
        return listTransport.toSet()
    }
}