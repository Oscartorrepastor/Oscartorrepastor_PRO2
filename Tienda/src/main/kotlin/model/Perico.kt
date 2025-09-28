package model

class Perico(
    var nomTienda: String
) {
    lateinit var almacen: Array<Producto?>
    var caja: Double = 0.00

    // init -> Ejecuta si o si despues del contructor (Primario o secundario)

    init {
        almacen = arrayOfNulls(6)
    }

    fun agregar(producto: Producto) {
        for (item in 0..almacen.size - 1) {
            if (almacen[item] == null) {
                almacen[item] = producto
                return
            }
        }
        print("El almacen esta completo")
    }

    // vamos a vender un producto. Para ello se solicita el id del productoa vender
    // En caso de estar en el almacen:
    // se elimina
    // se suma el precio a la caja
    // si se vende se da aviso de producto vendido y se da el valor de la caja
    // si no se encuentra se da aviso de que no esta en el almacen

    fun compra(id: Int) {
        for (item in 0..almacen.size - 1) {
            if (almacen[item] != null && almacen[item]?.id== id) {
                almacen[item]?.id
                caja += almacen[item]!!.precio
                almacen[item] = null
                print("Producto vendido ")
                return
            }
        }
        print("no esta la id")
    }

    fun buscarCategoria(categoria: Categoria){
        //Filtrando --> Obtengo varios
        val filtro: List<Producto?> = almacen.filter {
            return@filter it?.categoria == categoria
        }

        println("El numero de elemetos resultantes es: ${filtro.size}")
    }

    fun buscarId(id: Int){
        // buscando --> Obtengo un elemento
        val productoBusqueda: Producto? =  almacen.find {
            return@find it?.id == id // Esto se llama predicado
        }
    }



    fun mostrarAlamcen() {
        var nulos = 0
        almacen.forEach {
            it?.verDatos() ?: nulos++
        }
        if (nulos == almacen.size) {
            println("No hay productos en el almacen")
        }
    }

}