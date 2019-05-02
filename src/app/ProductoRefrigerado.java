package app;

public class ProductoRefrigerado extends Producto {

	// Atributos
	private int codigoOrganismoSupervisor;

	// Constructores
	// Constructor vacio
	public ProductoRefrigerado() {
		super();
		setCodigoOrganismoSupervisor(0000);
	}
	
	// Constructor completo
	public ProductoRefrigerado(int codigoInterno, int diaCaducidad, int mesCaducidad, int anoCaducidad, int lote,
			int codigoOrganismoSupervisor) {
		super(codigoInterno, diaCaducidad, mesCaducidad, anoCaducidad, lote);
		setCodigoOrganismoSupervisor(codigoOrganismoSupervisor);
	}
	
	// Constructor copia
	public ProductoRefrigerado(ProductoRefrigerado pr, int codigoInterno) {
		super(pr, codigoInterno);
		setCodigoOrganismoSupervisor(pr.getCodigoOrganismoSupervisor());
	}
	
	// Getters & Setters
	// Asumo que el codigo del organismo puede cambiar, por lo tanto debe poder ser modificado.
	public int getCodigoOrganismoSupervisor() {
		return codigoOrganismoSupervisor;
	}

	public void setCodigoOrganismoSupervisor(int codigoOrganismoSupervisor) {
		this.codigoOrganismoSupervisor = codigoOrganismoSupervisor;
	}
	
	// Sobrecarga metodo toString()
		@Override
		public String toString() {
			return "\n------Producto Refrigerado------ \nCodigo Interno: " + getCodigoInterno() + 
					"\nFecha Caducidad=" + getDiaCaducidad() + "/" + getMesCaducidad() + "/" + getAnoCaducidad() +
					"\nLote=" + getLote() +
					"\nCodigo organismo supervisor=" + codigoOrganismoSupervisor;
					
		}
}
