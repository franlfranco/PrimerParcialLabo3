package app;

import java.util.ArrayList;

public class Catalogo {

	// Atributos
	private ArrayList<Producto> catalogo;

	// Constructor
	public Catalogo() {
		catalogo = new ArrayList<Producto>();
	}

	// Metodo agregar
	public void agregarNuevo(Producto p) {
		if (!chequearCodigoInterno(p)) {
			catalogo.add(p);
			System.out.println("El producto " + p.getCodigoInterno() + " se agrego con exito");
		} else {
			System.out.println("El producto no se ha podido agregar al catalogo");
		}
	}

	// Metodo contarTipo()
	// Cada tipo esta representado por un int, pensado para aplicar en un menu
	// 1.Frescos
	// 2.Refrigerados
	// 3.Congelados
	public int contarTipo(int tipo) {
		int acumulador = 0;
		switch (tipo) {
		case 1:
			for (Producto p : catalogo) {
				if (p instanceof ProductoFresco) {
					acumulador++;
				}
			}
			break;

		case 2:
			for (Producto p : catalogo) {
				if (p instanceof ProductoRefrigerado) {
					acumulador++;
				}
			}
			break;

		case 3:
			for (Producto p : catalogo) {
				if (p instanceof ProductoCongelado) {
					acumulador++;
				}
			}
			break;
		}

		return acumulador;
	}

	public void listarTodo() {
		for (Producto p : catalogo) {
			System.out.println(p.toString());
		}
	}
	
	// Metodo listarTipo()
	// Cada tipo esta representado por un int, pensado para aplicar en un menu
		// 1.Frescos
		// 2.Refrigerados
		// 3.Congelados
	public void listarTipo(int tipo) {
		switch (tipo) {
		case 1:
			for (Producto p : catalogo) {
				if (p instanceof ProductoFresco) {
					System.out.println(p.toString());
				}
			}
			break;

		case 2:
			for (Producto p : catalogo) {
				if (p instanceof ProductoRefrigerado) {
					System.out.println(p.toString());
				}
			}
			break;

		case 3:
			for (Producto p : catalogo) {
				if (p instanceof ProductoCongelado) {
					System.out.println(p.toString());
				}
			}
			break;
		}
	}

	// Metodo auxiliar, retorna falso si el codigo interno no esta siendo usado en el catalogo, caso contrario true.
	public boolean chequearCodigoInterno(Producto p) {
		boolean flag = false;
		for (Producto prod : catalogo) {
			if (!flag && prod.equals(p)) {
				flag = true;
			}
		}
		return flag;
	}
}
