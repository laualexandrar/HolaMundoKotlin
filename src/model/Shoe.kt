package model

//class Shoe (var sku: Int, var mark:String) { // clases para datos  o Data class
class Shoe (name: String, description: String, sku: Int, var brand :String): Product( name, description, sku), ICrudActions { // aqui heredamos y me obliga a declararlos en su composicion (En el metodo constructor)

// class Shoe (var sku: Int, var mark:String): Any() { aqui estaba haciendo polimorfismo poniendo la clase any como super clase

    override  fun create(): String {
        saludar("Hola desde create")
        return "Create Shoe"
    }

    override fun read(): String {
        return "Read Shoe"
    }

    override fun update(): String{
        return "Update Shoe"
    }

    override fun delete(): String {
        return "Delete Shoe"
    }


    override fun toString(): String {
        return super.toString() + "SKU ID: $sku \nMarca: $brand \nModelo: $model \nSize: $size \nColor: $color"
    }

    init {
        println("SKU: $sku")
        println("Marca $brand")

    }

    //variables no encapsuladas
    var size: Int = 34 // esta seria el numero minimo
        set(value) {
            if(value >= 34)
            field = value // field toma el dato para que pueda ser alterado
            else
                field = 34
            }


            var color: String = "White"// valor por defecto white
            var model: String = "Boots" // a este no se asigne tennis
                set(value){
                    if (value.equals("Tenis"))
                        field = "Boots"
                    else
                        field = value
                }

}