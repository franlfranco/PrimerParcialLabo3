package app;

public class Producto {

	// Atributos
	private int codigoInterno;
	private int diaCaducidad;
	private int mesCaducidad;
	private int anoCaducidad; // dice año, no sean mal pensados
	private int lote;

	// Constructores
	// Constructor vacio
	public Producto() {
		super();
		this.codigoInterno = 1;
		this.diaCaducidad = 01;
		this.mesCaducidad = 01;
		this.anoCaducidad = 2000;
		setLote(0000);
	}

	// Constructor completo
	public Producto(int codigoInterno, int diaCaducidad, int mesCaducidad, int anoCaducidad, int lote) {
		super();
		this.codigoInterno = codigoInterno;
		this.diaCaducidad = diaCaducidad;
		this.mesCaducidad = mesCaducidad;
		this.anoCaducidad = anoCaducidad;
		setLote(lote);
	}

	// Constructor copia
	public Producto(Producto p, int codigoInterno) {
		super();
		this.codigoInterno = codigoInterno;
		this.diaCaducidad = p.getDiaCaducidad();
		this.mesCaducidad = p.getMesCaducidad();
		this.anoCaducidad = p.getAnoCaducidad();
		setLote(p.getLote());
	}

	// Getters & Setters
	// Asumo que el unico atributo que se debe poder cambiar es el lote,
	// el resto no deberian poder ser modificados una vez instanciado el Producto
	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public int getCodigoInterno() {
		return codigoInterno;
	}

	public int getDiaCaducidad() {
		return diaCaducidad;
	}

	public int getMesCaducidad() {
		return mesCaducidad;
	}

	public int getAnoCaducidad() {
		return anoCaducidad;
	}

	// Sobrecarga metodo equals
	public boolean equals(Producto p) {
		boolean flag = false;
		if (this.codigoInterno == p.getCodigoInterno()) {
			flag = true;
		}
		return flag;
	}

}
