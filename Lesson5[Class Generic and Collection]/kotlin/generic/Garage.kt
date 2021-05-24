package generic

import transport.Transport

class Garage<T : Transport>(val transport : T){

    val listTransport : MutableList<T> = mutableListOf()

    fun addTransport(newTransport : T){
        listTransport.add(newTransport)
    }

    fun removeTransport(removeTransport : T){
        if (!listTransport.isEmpty()){
            listTransport.remove(removeTransport)
        }else{
            println("this listTransport is empty")
        }
    }

    fun getTransport() : Set<Transport>{ // or List<Transport>
        return listTransport.toSet()    // or toList()
    }
}