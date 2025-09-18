import model.Producto

fun main() {
    var camiseta: Producto = Producto(id = 1, precio = 1.50)
    var zapatilla = Producto(2)
    var pantalon = Producto(3, "Pantalones", 30.00)
    var gorra = Producto(4, precio = 20.00, descropcion = "Gorra molona")
    var cartera = Producto(5, "cartera cuero", 10.00, "Cartera para guardar la pasta")

    val listaProductos: Array<Producto?> = arrayOf(camiseta, zapatilla, pantalon, gorra, cartera)

    //listaProductos[listaProductos.size-1].verDatos() // size porque aqui no esta lengch -1
    //listaProductos.last().verDatos() // Otra forma de mostrar la ultima posicion

    listaProductos.last()?.precio = 20.00
    listaProductos[2] = null
    listaProductos.last()?.verDatos()

    for (i in listaProductos){
        i?.verDatos()
    }

}