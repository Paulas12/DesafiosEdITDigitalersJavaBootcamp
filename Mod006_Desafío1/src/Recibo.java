
public class Recibo {
	//atributos 
	private String tipoElemento;
	private float valor;
	private int cantidad;
	private float valorParcial;
	
	//mutates
	public Recibo() {
		
	}
	public Recibo(String tipoElemento, float valor, int cantidad) {
		super();							//refiere a la super clase, aparece automaticamente al contruir a traves de fields
		this.tipoElemento = tipoElemento;
		this.valor = valor;
		this.cantidad = cantidad; 
	}
	
	public String getTipoElemento() {
		return tipoElemento;
	}
	public void setTipoElemento(String tipoElemento) {
		this.tipoElemento = tipoElemento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getValorParcial() {
		return valorParcial;
	}
	public void setValorParcial(float valorParcial) {
		this.valorParcial = valorParcial;
	}

}
