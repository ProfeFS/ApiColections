package es.edu.cesur.programacion.ejercicios.gestion_inventario;
public class App {
    public static void main(String[] args) {
        GestionInventario inventario = new GestionInventario();

        Articulo art1 = new Articulo("Lápiz", 101);
        Articulo art2 = new Articulo("Cuaderno", 102);
        Articulo art3 = new Articulo("Boli", 103);

        System.out.println("Agregando artículos al inventario:");
        inventario.agregarArticulo(art1);
        inventario.agregarArticulo(art2);
        inventario.agregarArticulo(art3);

        // Intentar agregar un artículo duplicado
        Articulo artDuplicado = new Articulo("LápizRojo", 101); // Mismo código que art1
        System.out.println("\nIntentando agregar un artículo duplicado:");
        inventario.agregarArticulo(artDuplicado);

        System.out.println("\nEliminando un artículo del inventario (código 102):");
        inventario.eliminarArticuloStream(102);

        System.out.println("\nListando todos los artículos disponibles en el inventario:");
		inventario.listarArticulos();
	}
}
