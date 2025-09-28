import model.Categoria
import model.Perico
import model.Producto

fun main() {
    var camiseta: Producto = Producto(id = 1, precio = 1.50, categoria = Categoria.Ropa)
    var zapatilla = Producto(2)
    var pantalon = Producto(3, "Pantalones", 30.00, categoria = Categoria.Ropa)
    var gorra = Producto(4, precio = 20.00, descropcion = "Gorra molona", categoria = Categoria.Ropa)
    var cartera = Producto(5, "cartera cuero", 10.00, descropcion = "Cartera para guardar la pasta", categoria = Categoria.Ropa)
    var telefon = Producto(6 , "Iphone" , 505.00 , descropcion = "Telefono movil", categoria = Categoria.Tecnologia )


    val listaProductos: Array<Producto?> = arrayOf(camiseta, zapatilla, pantalon, gorra, cartera)

    val listaProductosVacios: Array<Producto?> = arrayOfNulls(5)

    //listaProductos[listaProductos.size-1].verDatos() // size porque aqui no esta lengch -1
    //listaProductos.last().verDatos() // Otra forma de mostrar la ultima posicion


    listaProductos.last()?.precio = 20.00
    //listaProductos[2] = null
    listaProductos.last()?.verDatos()

    for (i in listaProductos){
        i?.verDatos()
    }

    listaProductos.forEach {
        it?.verDatos()
    }

    listaProductos.forEachIndexed { index , producto ->
        println("Mostrando datos en posicion $index")
        producto?.verDatos()
    }

    // Vamos a crear una tienda Para ello crear la clase necesaria dodne se pueda asignar
    // 1. Nombre a la tienda
    // 2. Almaces: Sitio donde se guardan los productos tiene tamaño fijo de 6
    // 3. Caja : Se guarda el dinero a la que se venda algo

    val perico: Perico = Perico("Perico")

    perico.almacen = listaProductos
    //perico.mostrarAlamcen()
    perico.buscarCategoria(Categoria.Ropa)

}