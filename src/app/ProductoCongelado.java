package app;

public class ProductoCongelado extends Producto{

	// Atributos
	private double temperatura;

	// Constructores
	// Constructor vacio
	public ProductoCongelado() {
		super();
		setTemperatura(0);
	}
	
	// Constructor completo
	public ProductoCongelado(int codigoInterno, int diaCaducidad, int mesCaducidad, int anoCaducidad, int lote,
			double temperatura) {
		super(codigoInterno, diaCaducidad, mesCaducidad, anoCaducidad, lote);
		setTemperatura(temperatura);
	}
	
	// Constructor copia
	public ProductoCongelado(ProductoCongelado pc, int codigoInterno) {
		super(pc, codigoInterno);
		setTemperatura(pc.getTemperatura());
	}
	
	// Getters & Setters
	// Asumo que la temperatura recomendada deberia poder ser modificada
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	// Sobrecarga metodo toString()
			@Override
			public String toString() {
				return "\n------Producto Congelado------ \nCodigo Interno: " + getCodigoInterno() + 
						"\nFecha Caducidad=" + getDiaCaducidad() + "/" + getMesCaducidad() + "/" + getAnoCaducidad() +
						"\nLote=" + getLote() +
						"\nTemperatura recomendada=" + temperatura;
						
			}
}
