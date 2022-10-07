package entidades;
import utilidades.Formato;

public class Cuenta extends Producto {
	private String tipo;

	public Cuenta() {
		generarNumeroProducto();
	}

	public Cuenta(Integer banco, Integer sucursal, String tipo) {
		super(banco, sucursal);
		this.tipo = tipo;
		generarNumeroProducto();

	}

	public String toString() {
		return "Cuenta [Banco=" + Formato.getFormato(getBanco(), "BANCO") + ", Sucursal="
				+ Formato.getFormato(getSucursal(), "BANCO") + ", Numero=" + Formato.getFormato(getNumero(), tipo)
				+ ", Tipo=" + tipo + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private void generarNumeroProducto() {
		Integer numero = 0;
		switch (tipo.toUpperCase()) {
		case "CC":
			numero = numeroCC++;
			break;
		case "CA":
			numero = numeroCA++;
			break;
		default:
			break;
		}
		setNumero(numero);
	}

}
