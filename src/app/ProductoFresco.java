package app;

public class ProductoFresco extends Producto {

	// Atributos
	private int diaEnvasado;
	private int mesEnvasado;
	private int anoEnvasado;
	private String paisOrigen;

	// Constructores
	// Constructor vacio
	public ProductoFresco() {
		this.diaEnvasado = 01;
		this.mesEnvasado = 01;
		this.anoEnvasado = 2000;
		setPaisOrigen("Uzbekistan");
	}

	// Constructor completo
	public ProductoFresco(int codigoInterno, int diaCaducidad, int mesCaducidad, int anoCaducidad, int lote,
			int diaEnvasado, int mesEnvasado, int anoEnvasado, String paisOrigen) {
		super(codigoInterno, diaCaducidad, mesCaducidad, anoCaducidad, lote);
		this.diaEnvasado = diaEnvasado;
		this.mesEnvasado = mesEnvasado;
		this.anoEnvasado = anoEnvasado;
		setPaisOrigen(paisOrigen);
	}

	// Constructor copia
	public ProductoFresco(ProductoFresco pf, int codigoInterno) {
		super(pf, codigoInterno);
		this.diaEnvasado = pf.getDiaEnvasado();
		this.mesEnvasado = pf.getMesEnvasado();
		this.anoEnvasado = pf.getAnoEnvasado();
		setPaisOrigen(pf.getPaisOrigen());
	}

	// Getters & Setters
	// Asumo que unicamente el pais de origen puede ser modificado,
	// el resto de los atributos no deberian ser modificados una vez instanciado el
	// Producto
	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public int getDiaEnvasado() {
		return diaEnvasado;
	}

	public int getMesEnvasado() {
		return mesEnvasado;
	}

	public int getAnoEnvasado() {
		return anoEnvasado;
	}

	// Sobrecarga metodo toString()
	@Override
	public String toString() {
		return "\n------Producto Fresco------ \nCodigo Interno: " + getCodigoInterno() + 
				"\nFecha Caducidad=" + getDiaCaducidad() + "/" + getMesCaducidad() + "/" + getAnoCaducidad() +
				"\nLote=" + getLote() +
				"\nFecha Envasado=" + diaEnvasado + "/" + mesEnvasado + "/" + anoEnvasado +
				"\nPais Origen=" + paisOrigen;
	}

}
