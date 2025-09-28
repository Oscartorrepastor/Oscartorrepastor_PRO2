package model

class Cliente(var id: Int, var nombre: String) {

    lateinit var carrito: ArrayList<Producto>
    var factura: Double = 0.0

    init {
        carrito = ArrayList()
    }

    fun agregarProducto(producto: Producto) {
        //
        carrito.add(producto)

        println("Producto agregado correctamete")
    }

    // Eliminar un producto del carrito
    // en caso de no estar el id en el carrito --> aviso de que no se encuentra
    // en caso de si estar en el carrito y solo existir uno, lo elimina
    // en caso de si estar en el carrito y existir varios confirmacion de eliminar 1 o todos

    fun eliminarProducto(id: Int) {

        val filtro: List<Producto?> = carrito.filter {
            return@filter it.id == id
        }
        println("El nomero de resultados es: ${filtro.size}")

        if (filtro.size == 0) {
            println("No hay ningun ID en el carro")
        } else if (filtro.size == 1) {
            carrito.remove(filtro.first())
            println("Borrado correctamente")
        } else {
            println("Se han encontrado varios cual quieres borrar: 1 para el primero n para todos")
            val opcion: String = readln()
            if (opcion.equals("1", false)) {
                carrito.remove(filtro.first())
            } else if (opcion.equals("n", true)) {
                carrito.removeAll(filtro.toSet())
            }
        }

    }

    //Hacer un metodo para calcular la factura del cliente
    // cuando un cliente pide la fectura se muestra por consola y vacia el carrito

    fun calcularFactura() {
        carrito.forEach {
            factura+=it.precio
        }
        println("Debes un total de: $factura")
        carrito.clear()
    }


    // Mostrar el producto que esta en una posicion indicada

    fun verPosicion(posicion: Int) {
        if (posicion > carrito.size - 1) {
            println("Esa posicion no existe")
        } else {
            carrito[posicion].verDatos()
        }
    }

    // Mostrar todos los elementos del carrito

    fun mostrarCarro() {
        if (carrito.isEmpty()) {
            println("No hay nada en el carro")
        } else {
            println("Esto tienes en el carro")
            carrito.forEach { it.verDatos() }
        }
    }

}