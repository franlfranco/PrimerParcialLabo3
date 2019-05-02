package app;

public class Main {

	public static void main(String[] args) {

		// Creacion productos frescos
		Producto pf1 = new ProductoFresco(); // Constructor vacio
		Producto pf2 = new ProductoFresco(2, 03, 05, 2003, 0001, 06, 06, 2002, "Argentina"); // Constructor completo
		Producto pf3 = new ProductoFresco((ProductoFresco) pf2, 3); // Constructor copia
		Producto pf4 = new ProductoFresco((ProductoFresco) pf2, 3); // Para chequear que no agregue repetidos

		// Creacion productos refrigerados
		Producto pr1 = new ProductoRefrigerado(); // Constructor vacio, no deberia poder ser agregado porque comparte codigo con pf1
		Producto pr2 = new ProductoRefrigerado(4, 03, 05, 2003, 0002, 123456); // Constructor completo
		Producto pr3 = new ProductoRefrigerado((ProductoRefrigerado) pr2, 5); // Constructor copia

		// Creacion productos congelados
		Producto pc1 = new ProductoCongelado(); // Constructor vacio, no deberia poder ser agregado porque comparte codigo con pf1
		Producto pc2 = new ProductoCongelado(6, 03, 05, 2003, 0002, -5); // Constructor completo
		Producto pc3 = new ProductoCongelado((ProductoCongelado) pc2, 7); // Constructor copia
		
		// Agregar productos al catalogo
		Catalogo catalogo = new Catalogo();
		catalogo.agregarNuevo(pf1);
		catalogo.agregarNuevo(pf2);
		catalogo.agregarNuevo(pf3);
		catalogo.agregarNuevo(pf4);
		catalogo.agregarNuevo(pr1);
		catalogo.agregarNuevo(pr2);
		catalogo.agregarNuevo(pr3);
		catalogo.agregarNuevo(pc1);
		catalogo.agregarNuevo(pc2);
		catalogo.agregarNuevo(pc3);
		
		// Contar productos
		// Ver uso del metodo contarTipo en clase Catalogo
		System.out.println("\n\n CONTAR POR TIPO");
		System.out.println("La cantidad de productos frescos en el catalogo es: " + catalogo.contarTipo(1));
		System.out.println("La cantidad de productos refrigerados en el catalogo es: " + catalogo.contarTipo(2));
		System.out.println("La cantidad de productos congelados en el catalogo es: " + catalogo.contarTipo(3));
		
		// Listar todo
		System.out.println("\n\n LISTAR TODO");
		catalogo.listarTodo();
		
		// Listar tipo
		// Ver uso del metodo listarTipo en clase Catalogo
		System.out.println("\n\n LISTAR POR TIPO");
		System.out.println("\nPRODUCTOS FRESCOS");
		catalogo.listarTipo(1);
		System.out.println("\nPRODUCTOS REFRIGERADOS");
		catalogo.listarTipo(2);
		System.out.println("\nPRODUCTOS CONGELADOS");
		catalogo.listarTipo(3);


	}

}
