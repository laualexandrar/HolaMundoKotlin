package model

abstract class Product(var name: String, var description: String, var sku: Int ){

    override fun toString(): String {
        return "\nName: $name \ndescription: $description \nSKU: $sku"
    }

   /* open  fun create(): String {
        return create()              metodo con declaracion
    } */
/*
    abstract fun create(): String //este es un metodo abstracto, es decir un metodo sin declaracion

    abstract fun read(): String

    abstract fun update(): String

    abstract fun delete():String*/

    //para evitar inconsistencias ... de que clases si se puede heredar y de que clases no por logica del negocio

   /* open fun read(): String {
        return read()
    }
    open fun update(): String {
        return update()
    }
    open fun delete():String {
        return delete()
    }*/
}