
public class Elementos {
	//atributos
	private String tipoElemento;
	private float ancho;
	private float alto;
	private float peso;
	
	//mutates
	public Elementos() {
		
	}
	public Elementos(String tipoElemento, float ancho, float alto, float peso) {
		super();
		this.tipoElemento = tipoElemento;
		this.ancho = ancho;
		this.alto = alto;
		this.peso = peso;
	}
	
	public String getTipoElemento() {
		return tipoElemento;
	}
	
	public void setTipoElemento() {
		this.tipoElemento = tipoElemento;
	}
	
	public float getAncho() {
		return ancho;
	} 
	
	public float getAlto() {
		return alto;
	} 
	
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	
	
	public float getPeso() {
		return peso;
	} 

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void mostrarDatos() {
		System.out.println("Se ha/han insertado un/unos envase/s");
		System.out.println("Datos del elemento: ");
		System.out.println("Peso: " + peso + " grs ");
		System.out.println("Alto: " + alto + " mm ");
		System.out.println("Ancho: " + ancho + " mm ");
		System.out.println("Tipo: " + getTipoElemento());
		System.out.println("Puede seguir ingresando envases, o presione IMPRIMIR para poder imprimir su recibo");
		
	}
	
}
